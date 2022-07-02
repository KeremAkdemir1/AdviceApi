package com.example.mysqllesson.controller;

import com.example.mysqllesson.Exceptions.ResourceNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptionHandler {
    @ExceptionHandler
    @ResponseBody
    public String ResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        return resourceNotFoundException.getMessage();
    }
}
