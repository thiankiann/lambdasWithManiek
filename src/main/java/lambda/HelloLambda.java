package lambda;

public class HelloLambda {
    public static void main(String[] args) {
        ManiekRunner maniekRunner = new ManiekRunner();
        Runner runner = new ManiekRunner();
        runner.go();

     //   runner.walk(); // doesn't compile

        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {

            }
        };
        anonymousRunner.go();
    }
}
