package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionsHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    //        /ეს ჯერ არ ვიცი რა არის/    /ეს სახელი დავარქვი/     /აქ ამოვირჩიე ექსეფშენის ტიპი/
    protected ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException ex){
        ExceptionBody exceptionBody = new ExceptionBody(ex.getMessage(), System.currentTimeMillis());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionBody);
    }
}
