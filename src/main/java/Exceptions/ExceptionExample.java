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
        String nullString = null;
        nullString.concat(" ma kota");
    }
}
