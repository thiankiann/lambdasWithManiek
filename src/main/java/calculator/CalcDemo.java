package calculator;

public class CalcDemo {
    public static void main(String[] args) {
        System.out.println("playing with calc lambdas  ");
      int c = 5;
      int d = 6 ;
        Adder adder = (a , b) -> { return a + b; };

        System.out.println(" a + b = " + adder.add(c,d) );
    }


}
