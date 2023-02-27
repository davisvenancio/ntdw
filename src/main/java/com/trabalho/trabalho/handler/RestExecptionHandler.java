package com.trabalho.trabalho.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.trabalho.trabalho.model.error.ErrorMessage;
import com.trabalho.trabalho.model.exeception.ResourceNotFoundException;

@ControllerAdvice
public class RestExecptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException ex){

        ErrorMessage error = new ErrorMessage("Not found", HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
}
