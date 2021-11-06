package ru.goridko_igor.exception;

public class StatusNotFoundException extends RuntimeException {
    public StatusNotFoundException() {
    }

    public StatusNotFoundException(String message) {
        super(message);
    }

    public StatusNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
