package lambda;

public interface WorkLifeBalance {

    void hardWork();
    void sleep(int i);

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
    }



}
