package Exceptions;

public class NickDealer {
     private ExceptionGenerator exceptionGenerator;

    public NickDealer(ExceptionGenerator exceptionGenerator) {
        this.exceptionGenerator = exceptionGenerator;
    }
    public String nickFromDealer() throws NoNickException {
        return exceptionGenerator.nick();
    }
    public String nick() {
        return exceptionGenerator.nickWithRuntimeException();
    }
}
