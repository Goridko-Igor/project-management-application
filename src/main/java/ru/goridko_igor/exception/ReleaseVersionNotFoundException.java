package ru.goridko_igor.exception;

public class ReleaseVersionNotFoundException extends RuntimeException {
    public ReleaseVersionNotFoundException() {
    }

    public ReleaseVersionNotFoundException(String message) {
        super(message);
    }

    public ReleaseVersionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
