package com.otatkay.vanillaweb.exception;

public class VanillaException extends Exception {

    public VanillaException(String message) {
        super(message);
    }
    public VanillaException(String message, Exception e) {
        super(message,e);
    }
    public VanillaException() {
        super();
    }
}
