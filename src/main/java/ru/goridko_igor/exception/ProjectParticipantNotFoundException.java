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
}
