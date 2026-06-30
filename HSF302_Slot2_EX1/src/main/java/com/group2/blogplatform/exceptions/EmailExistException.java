package com.group2.blogplatform.exceptions;


public class EmailExistException extends RuntimeException {
    public EmailExistException(String message) {
        super(message);
    }
}