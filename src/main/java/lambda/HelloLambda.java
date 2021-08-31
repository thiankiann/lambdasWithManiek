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

/*
Zad3 zamien popwyzsze wyolanie metodki handleRunner -> na lambde
 */
    handleRunner(() -> System.out.println("Inside lambda call (Zad 3)"));

/*
Zad4 napiszmy z palca lambde ktora implemetuje nasza metodke go() ( z Interface Runner)
 */
    Runner myFirstLambda = () -> {};
    handleRunner(myFirstLambda);
/*
Zad4 napiszmy z palca lambde ktora implemetuje nasza metodke go() ( z Interface Runner) -ale dodatkowo ja nadpisuje (np. + printl.)
 */
    Runner mySecondLambda = () -> {
        System.out.println("Zad 4 - mySecondLambda");
    };
    handleRunner(mySecondLambda);
/*
Zad5 Wywolajmy teraz sobie  te 3 metodki ( z interface Runner) w naszym mainie
 */
    mySecondLambda.go();
    mySecondLambda.go(8);
    Runner.walk();
    //Zwroc uwage ze w ostatnim przypadkunie moglismy wywolac przez lambde - gdyz walk() jest metoda statyczna
        //- czyli jest nie zwiazana z samym obiektem ale z klasa
        //→ wiec powinnismy wywolac poprzez Klase (interfejs Runner)
}
/*
Zad 1 Stworzmy metodke (publiczna statyczna), ktora przyjmie cos typu Runner i wywola metodke go()
 */
       public static void handleRunner(Runner anyRunner){
           System.out.println("calling handleRunner");
           anyRunner.go();
        }

}
