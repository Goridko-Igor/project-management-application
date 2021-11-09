package ru.goridko_igor.exception;

public class TaskTypeNotFoundException extends RuntimeException {
    public TaskTypeNotFoundException() {
    }

    public TaskTypeNotFoundException(String message) {
        super(message);
    }

    public TaskTypeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
