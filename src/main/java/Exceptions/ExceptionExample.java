package Exceptions;

public class ExceptionExample {
    public static void main(String[] args) {

        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        //handle or declare
        String myNick;
        try {
            myNick = exceptionGenerator.nick();
        } catch (NoNickException e) {
            System.out.println("Problem with nic generator.");
            myNick = "this user has no nick";
        }

        System.out.println("my nick is " + myNick);
    //    String nullString = null;
    //    nullString.concat(" ma kota");

        System.out.println("with dealer ");
        NickDealer nickDealer = new NickDealer(new ExceptionGenerator());
        System.out.println("here???");

        try {
            nickDealer.nickFromDealer();
        } catch (NoNickException e) {
            e.printStackTrace();
        }

        nickDealer.nick();

        myNick = exceptionGenerator.nickWithRuntimeException();

    }
}
