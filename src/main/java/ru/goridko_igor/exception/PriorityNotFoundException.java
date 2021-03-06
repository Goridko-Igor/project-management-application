package ru.goridko_igor.exception;

public class PriorityNotFoundException extends RuntimeException {
    public PriorityNotFoundException() {
    }

    public PriorityNotFoundException(String message) {
        super(message);
    }

    public PriorityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
