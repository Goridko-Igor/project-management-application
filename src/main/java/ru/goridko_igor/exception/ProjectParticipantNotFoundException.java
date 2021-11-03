package ru.goridko_igor.exception;

public class ProjectParticipantNotFoundException extends RuntimeException {
    public ProjectParticipantNotFoundException() {
    }

    public ProjectParticipantNotFoundException(String message) {
        super(message);
    }

    public ProjectParticipantNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectParticipantNotFoundException(Throwable cause) {
        super(cause);
    }

    public ProjectParticipantNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
