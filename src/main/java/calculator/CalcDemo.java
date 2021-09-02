package calculator;

public class CalcDemo {
    public static void main(String[] args) {
        System.out.println("playing with calc lambdas  ");
//Zad 1   -> lambdas adding
        int c = 5;
        int d = 6;
        Adder<Integer> adder = (Integer a, Integer b) -> {   // tu nie trzeba bylo pisac Integer-ow po prawej stronie (w () )- to pokazowka ze jak  juz piszemy to musza byc takie same jak z lewej strony = ( w <> )
            return a + b;
        };

        System.out.println(" a + b = " + adder.add(c, d));

//Zad2  -> lambdas adding + comment
        Long e = 777L;
        Long f = 888L;
        String comment1 = "my comment";

        MyAdder myAdder = (a, b, comment) -> {
            System.out.println(comment);
            return a + b;
        };

        System.out.println(" x + y = " + myAdder.mkAdder(e, f, comment1));

//Zad3  -> lambdas subtraction

        Subtraction<Integer> subtraction = (a, b) -> {
            return a + b;
        };

        System.out.println(" a - b = " + subtraction.sub(c, d));

//Zad4  -> lambdas multiplication

        Multiplication<Integer> multiplication = (a, b) -> {
            return a * b;
        };

        System.out.println(" a * b = " + multiplication.multi(c, d));

//Zad5  -> lambdas division

        Double g = 9.0;
        Double h = 4.0;

    Division<Double> division = (a, b) -> {
        return a / b;
    };

        System.out.println(" a / b = " + division.div(g,h));
    }
}

