package lambda;

public class WorkLifeBalanceImplementation implements WorkLifeBalance{
    @Override
    public void hardWork() {
        System.out.println("W -outside Interface");
    }

    @Override
    public void sleep(int i ) {
        System.out.println("S - outside Interface");

    }
}
