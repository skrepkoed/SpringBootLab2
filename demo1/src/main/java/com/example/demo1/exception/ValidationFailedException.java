package com.example.demo1.exception;

public class ValidationFailedException extends Exception {
    public ValidationFailedException(String message){
        super(message);
    }
}
