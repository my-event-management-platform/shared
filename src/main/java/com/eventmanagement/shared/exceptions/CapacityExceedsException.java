package com.eventmanagement.shared.exceptions;

public class CapacityExceedsException extends RuntimeException{
    public CapacityExceedsException(String message) {
        super(message);
    }
}
