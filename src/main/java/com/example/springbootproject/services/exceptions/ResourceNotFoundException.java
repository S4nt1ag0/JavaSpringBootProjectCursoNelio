package com.example.springbootproject.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Long id){
        super("Resource not found. Id: "+ id);
    }
}
