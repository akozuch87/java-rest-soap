package pl.sapiens.javarestsoap.exception;

public class NoReservationFoundExceptionBetter extends RuntimeException{

    public NoReservationFoundExceptionBetter() {
    }

    public NoReservationFoundExceptionBetter(String message) {
        super(message);
    }

    public NoReservationFoundExceptionBetter(String message, Throwable cause) {
        super(message, cause);
    }

    public NoReservationFoundExceptionBetter(Throwable cause) {
        super(cause);
    }

    public NoReservationFoundExceptionBetter(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
