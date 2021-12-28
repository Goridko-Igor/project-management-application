package ru.goridko_igor.dto;

public class ExceptionHandlerMessage {
    private String message;

    public ExceptionHandlerMessage() {

    }

    public ExceptionHandlerMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
