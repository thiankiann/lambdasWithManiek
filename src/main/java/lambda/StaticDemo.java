package lambda;

public class StaticDemo {

    public static void demo(){
        System.out.println("static demo");
    }
    public void crash(){
        System.out.println("no to boom");
    }
    public static void main(String[] args) {
        demo();
        StaticDemo.demo();

        StaticDemo empty = null;

        empty.demo();  //nie wywali NPE- poniewaz demo() jest klasa statyczna (nie zwiazana z obiektem a z klasa) wiec kompilator zamienia nam to na StaticDemo.demo()

        empty.crash(); // NPE - gdyz metoda crash jest niestatyczna - wiec zwiazana zobiektem - ktory jest nullem - wiec wywali nam NullPointEXception
    }

}
