package com.otatkay.vanillaweb.exception;

public class InitializationException extends RuntimeException {
    private final Exception initialException;
    private final String message;

    public InitializationException(String Message) {
        this(Message, null);
    }

    public InitializationException(String Message, Exception ex) {
        message = "Unable to initializa app. Reason: " + Message;
        initialException = ex;
    }

    public String getMessage() {
        return message + initialException.getMessage();
    }
}
