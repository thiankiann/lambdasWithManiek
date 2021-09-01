package lambda;

@FunctionalInterface
public interface WorkLifeBalance {

    void hardWork();
    default void sleep(int i) {}

    public static void main(String[] args) {
//Zad.1 Napisz  klase anonimowa wewnatrz maina , ktora  :
//       A. implement WorkLifeBalance in separate class
//       B. use WorkLifeBalance as anonymous class

    WorkLifeBalance workLifeBalance = new WorkLifeBalance() {
        @Override
        public void hardWork() {
            System.out.println("W");
        }

        @Override
        public void sleep(int i) {
            System.out.println("S");
        }
    };
        //Zad.2 What we need to change in interface to write Zad 1 by using Lambdas ?
        //- write another implementation WorkLifeBalance - by using lambdas this time
    WorkLifeBalance workLifeBalance1 = () -> { System.out.println("with lambda"); };

    workLifeBalance1.hardWork();

    }



}
