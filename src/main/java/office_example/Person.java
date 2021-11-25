package office_example;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String InsuranceNumber;

    public Person(String name, String surname, int age, String insuranceNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        InsuranceNumber = insuranceNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getInsuranceNumber() {
        return InsuranceNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", InsuranceNumber='" + InsuranceNumber + '\'' +
                '}';
    }
}
