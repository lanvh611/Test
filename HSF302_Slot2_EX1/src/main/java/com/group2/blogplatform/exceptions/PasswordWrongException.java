package com.group2.blogplatform.exceptions;

public class PasswordWrongException extends RuntimeException {
    public PasswordWrongException(String message) {
        super(message);
    }
}
