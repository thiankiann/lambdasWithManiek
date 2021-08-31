package lambda;

public interface Runner {
    void go();

    default void go(int speed){
        System.out.println("current speed is " + speed);
    }
    static void walk(){
        System.out.println("static walk method");
    }
}
