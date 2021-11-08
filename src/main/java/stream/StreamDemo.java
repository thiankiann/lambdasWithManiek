package stream;

import model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Person youngPerson = new Person("Jan" , "Kowalski" , 17);
        Person oldPerson = new Person("Jan" , "Nowak" , 117);
        Person arek = new Person("Arek" , "U." , 8);
        Person marta = new Person("Marta" , "G." , 47);


        List<Person> persons = List.of(youngPerson, oldPerson, arek, marta);
         //persons.add(null); //immutable list can not add anything

        persons.stream()
                .filter(person -> {
                    boolean isAdult =person.getAge() >=18;
                    System.out.println(person.getName() + " is " + (isAdult ? "" : "not ") + "adult");
                    return isAdult;
                })
                .collect(Collectors.toList());
        System.out.println("==========================");
       persons.stream()
            .filter(person -> {
                boolean isAdult = person.getAge() >= 18;
                System.out.println( person.getName() +" is" + (isAdult ? "" : " not") + " an adult");
                return isAdult;
            })

             .map(person -> person.getName() )
               .findAny();

    }

}
