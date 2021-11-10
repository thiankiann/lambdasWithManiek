package lis_vs_array;

import java.util.List;


public class GenericFirsTaste {
    public static void main(String[] args) {

        List<Animal> animalList = List.of(new Animal(), new Cat(), new Dog());
        List<Cat> catList = List.of(new Cat(), new Cat());
        List<Dog> dogList = List.of(new Dog());

//Ad.7 (wywolanie)
    showAnimalList(animalList);
    showAnimalList(catList);
    showAnimalList(dogList);

    showAnimalListSetter(animalList);
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
}
