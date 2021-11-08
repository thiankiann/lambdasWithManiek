package lis_vs_array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListVsArrayDemo {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};  // 3 elements (prostych) , array is object
        Object objectArray = intArray;

        Integer[] integers = {Integer.valueOf(1), 2, 3};
        Object[] whatIsIt = integers;
        objectArray = integers;


//Zad 1 create tab of longs  and use our method playWithArrays
        long[] longArray = {1, 2, 3};
        //   playWithArrays(longArray);  //wywala sie przy uruchamianiu - pewine to blad typow

//Zad 2 create tab of Strings and use our method playWithArrays
        String[] strings = {"one", "two"};
        playWithArrays(strings);



//Zad 3 sprawdzimy czy mozna dodac element Cat do tabl. Dog
    // hierarchia dziedziczenia: Object -> Animal -> Dog/Cat

    Cat[] cats = {new Cat(), new Cat()};
    Dog[] dogs = {new Dog()};

    addDog(dogs);
   // addDog(cats);     //unsafe!

//Zad4 Using generic types in Lists - create List of Doga and list of Cats

        List<Dog> dogList = List.of(new Dog(), new Dog());   // we can't add new elements after - Lists are immutable(UnsupportedOperationException)
        List<Cat> catList = List.of(new Cat());
/*
// the same as line above but in old way (before Java9) - robiono to na 2 sposoby
    // 1st way     - > tworzono liste a nastepnie dodawano do niej elementy
    List<Dog> dogList1 = new ArrayList<>();
    dogList1.add(new Dog());
    dogList1.add(new Dog());
                            //here we can add new elements

    //2nd way -> tworzono liste uzywajac metodki Array.asList()
    List<Dog> fromArray = Arrays.asList(new Dog(),new Dog());
      ///fromArray.add(new Dog()); // nie mozna dodawac(bo tu kozystamyz tablicy) - bo wyskoczy UnsupportedOperationException
                          //here we can't add new elements
 */

}
    public static void addDog(Animal[] animals){  // do Zad 3
        animals[0] = new Dog();  // arrays always remember its type / dlatego jesli przyjdzie tu cokolwiek innego niz tablica psow to sie wykrzaczy (
    }

    public static void playWithArrays(Object maybeArray) {
        if (maybeArray instanceof int[]) {
            int[] intArray2 = (int[]) maybeArray;
        }

    }
}
