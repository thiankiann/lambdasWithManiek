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

    }

//Exc.7  Create method which take any List of Animals and will print it Napisz metodke ktora przyjemie dowolna Liste zwierzat  i ja wypisze
    public static void showAnimalList(List<? extends Animal> animal) {
        System.out.println(animal);
    }
}
