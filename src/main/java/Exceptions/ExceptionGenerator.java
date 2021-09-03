package Exceptions;

import java.util.Random;

public class ExceptionGenerator {
    public String nick() throws NoNickException{
        Random random = new Random();
        if (random.nextInt(100) % 2 == 0 ){
            return "M";
        }else {
            throw new NoNickException("I have no nick ..");
        }
    }
    public String nickWithRuntimeException() throws NoNicRuntimeException{
        Random random = new Random();
        if (random.nextInt(100) % 2 == 0 ){
            return "M";
        }else {
            throw new NoNicRuntimeException("I have no nick ..");
        }
    }
}
