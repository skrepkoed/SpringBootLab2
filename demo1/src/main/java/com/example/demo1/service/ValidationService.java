package com.example.demo1.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo1.exception.ValidationFailedException;
@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}
