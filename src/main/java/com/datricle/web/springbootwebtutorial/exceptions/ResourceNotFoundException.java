package com.datricle.web.springbootwebtutorial.exceptions;

public class ResourceNotFoundException  extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}