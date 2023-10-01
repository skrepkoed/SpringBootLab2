package com.example.demo1.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo1.exception.ValidationFailedException;
@Service
public class RequestValidationService implements ValidationService {
    public void isValid(BindingResult bindingResult) throws ValidationFailedException{
        if(bindingResult.hasErrors()){
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
}
