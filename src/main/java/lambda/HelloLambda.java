package lambda;

public class HelloLambda {
    public static void main(String[] args) {
        ManiekRunner maniekRunner = new ManiekRunner();
        Runner runner = new ManiekRunner();

        // runner.go();  //zastepujemy ponizszym :
        handleRunner(runner);
        //   runner.walk(); // doesn't compile

        //defining anonymous class (przypisana do zmiennej anonymousRunner)
        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("inside anonymous class");
            }
        };

        //anonymousRunner.go();
        //zastepujemy ponizszym :
        handleRunner(runner);
/*
Zad2 Wywolaj jeszcze raz metode handleRunner i przekaz do srodka - jeszcze raz obiekt klasy anonimowej
    - ale - definiowany w momencie wywolywania
 */
        handleRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("Inside  method call (Zad 2)");
            }
        });
    }
/*
Zad 1 Stworzmy metodke (publiczna statyczna), ktora przyjmie cos typu Runner i wywola metodke go()
 */
       public static void handleRunner(Runner anyRunner){
           System.out.println("calling handleRunner");
           anyRunner.go();
        }

}
