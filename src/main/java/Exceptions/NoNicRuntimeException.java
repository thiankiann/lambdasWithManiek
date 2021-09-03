package Exceptions;

public class NoNicRuntimeException extends RuntimeException{
      
    public NoNicRuntimeException() {
    }

    public NoNicRuntimeException(String message) {
        super(message);
    }

    public NoNicRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNicRuntimeException(Throwable cause) {
        super(cause);
    }

    public NoNicRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
