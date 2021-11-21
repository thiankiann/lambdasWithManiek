package lis_vs_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class GenericFirsTaste {
    public static void main(String[] args) {
       // -----------------------------
        //List<Animal> animalList = List.of(new Animal(), new Cat(), new Dog()); // zadanie 10 mi nie dzialalo - musialem zamienic ta linijke 2ma kolejnymi

        List<Animal> immutableAnimalList = List.of(new Animal(), new Dog(), new Cat());
        List<Animal> animalList = new ArrayList<>(immutableAnimalList);
       // ------------------------------------
        List<Cat> catList = List.of(new Cat(), new Cat());
        List<Dog> dogList = List.of(new Dog());

//Ad.7 (wywolanie)
    showAnimalList(animalList);
    showAnimalList(catList);
    showAnimalList(dogList);

    showAnimalListSetter(animalList);
    showAnimalListSetterRandom(animalList);

    //Ad.10 (wywolanie)
        addElementToAnimalCollection(animalList);
       //addElementToAnimalCollection(catList);
       // addElementToAnimalCollection(dogList);
       //singleton - empty List , parameterized for Object Type (gotowy szablon z biblioteki Javy( z Collections))
       // List<Object> emptyObjectList = Collections.emptyList();
       // addElementToAnimalCollection(emptyObjectList);

    }
//Exc.7  Create method which take any List of Animals and will print it Napisz metodke ktora przyjemie dowolna Liste zwierzat  i ja wypisze
    public static void showAnimalList(List<? extends Animal> animals) {
        System.out.println(animals);
    }

//Exc.8  uzyjmy metodki get z klaski Animal - zrobimy to : Otwierajac streama na  naszej liscie, a nastepnie zmieniamy nazwe kazdego animala ( najprostrzy przyklad - to samo imie dla kazdego zwierzecia
    public static void showAnimalListSetter(List<? extends Animal> animals) {

        animals.stream().
                forEach(animal -> animal.setName("Fifi"));

        System.out.println("Exc. 8");
        animals.forEach(animal -> System.out.println(animal.getName()));
       //System.out.println(animals.getName());
    }
//Exc.9  uzyjmy metodki get z klaski Animal - w tym samym ceu co w exc.8 -ale tak zeby byly ustawiane rozne imiona (random)
    public static void showAnimalListSetterRandom(List<? extends Animal> animals) {

        List<String> names = List.of("Azor" , "Burek" , "Pimpek" , "Brutus");
        Random random = new Random();
    animals.stream().
            forEach(animal -> animal.setName(names.get(random.nextInt(names.size()))));

        System.out.println("Exc.9");

    animals.stream().
            forEach(animal -> System.out.println("new name of Animal is : " + animal.getName()));


    }
// Exc.10  Create method which will add new elements to a list  in a safe way (use wildcards) for a supertypes l ( f.e. Object
  /*  public static void addElementToAnimalCollection(List <? super  Animal> animals) {
    //   animals.add(new Dog());
     //  animals.add(new Cat());
      // animals.add(new Animal());

    } */
    // add
    // safe adding
    // call with any supertype of Animal and Animal
    public static void addElementToAnimalCollection(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Animal());
    }
}
