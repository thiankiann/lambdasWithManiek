package optional;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class MySecret<T> {
    T mySecret ;

    public MySecret(T mySecret) {
        this.mySecret = mySecret;
    }

    public T getMySecret() {
        return mySecret;
    }

    public void setMySecret(T mySecret) {
        this.mySecret = mySecret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
                "mySecret='" + mySecret + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MySecret<String> realOne = new MySecret<>("I like learning and teaching Java");
        MySecret<String> withNull = new MySecret<>(null);
        printSecretLength(realOne);
        printSecretLength(withNull);

        MySecret<Integer> secretNumber = new MySecret<>(38);
        MySecret<Integer> secretNullNumber = new MySecret<>(null);
       // var secretNumOnr =secretNumber.getMySecret();  //42
       // var secretNull = secretNullNumber.getMySecret(); // null

        //zamiana na Optional<Integer>
        Optional<Integer> secretNumOnr = Optional.ofNullable(secretNumber.getMySecret());  //38
        Optional<Integer> secretNull = Optional.ofNullable(secretNullNumber.getMySecret()); // null



    }
    public static void printSecretLength(MySecret<String> mySecret) {
        //int secretLen = mySecret.getMySecret().length();

        int secretLen;
      //secretLen= mySecret.getMySecret() != null ? mySecret.getMySecret().length() : 0;  // it's the same as line under
        secretLen= nonNull(mySecret.getMySecret() )? mySecret.getMySecret().length() : 0; //we used method nonNull() instead != null

/*     the same functionality  than that one line above
       if(mySecret.getMySecret() != null){
            secretLen = mySecret.getMySecret().length();
        }else {
            secretLen = 0;
        }
 */
       System.out.println("Mt secret has " + secretLen + " characters" );
    }
 //zad  Optional + Generyki . Napisz  metode generyczna, tworzaca Optional z T  + wariacje
    public static <T> void processSecret(T optional){

        // make optional from T
        Optional<T> opt = Optional.ofNullable(optional);

        // make optional from number
        int number = 4;
        Optional<Integer> numberInsideOptional = Optional.of(number);

    //wyciagnij zawartosc z optionala (pudelka)

        T unpacked = opt.get(); //Do not do that!!! - metodka get() nie obsluguje nulla

        // rozwiazanie za pomoca if-ow
        if(opt.isPresent()){
            unpacked = opt.get();
        } else {
            unpacked = null;
        }

        // rozwiazanie metodka orElse() ( to to samo co z if-ami ale krocej)
        unpacked = opt.orElse(null);

        // rozwiazanie z uzyciem genrykow i lambd (b. skomplikowane) oraz uzywajac rzutowania (T)
        unpacked = (T) opt.or(()-> null);


        //chcemy sprawdzic zawartosc (malego) stringa - zwwrocic optionala(od <String>a), a jesli jest on pusty to inny obiekt
        Optional<String> string = Optional.empty();
        //robimy to uzywajac referencje FromOptional
        Optional<String> FromOptional = string.or(() -> Optional.of("no value"));
    }
}
