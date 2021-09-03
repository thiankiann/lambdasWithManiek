package Exceptions;

public class NoNickException extends Exception{
    public NoNickException() {
    }

    public NoNickException(String message) {
        super(message);
    }

    public NoNickException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickException(Throwable cause) {
        super(cause);
    }

    public NoNickException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
