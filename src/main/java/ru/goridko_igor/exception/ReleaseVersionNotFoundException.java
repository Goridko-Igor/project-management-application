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

    public ReleaseVersionNotFoundException(Throwable cause) {
        super(cause);
    }

    public ReleaseVersionNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
