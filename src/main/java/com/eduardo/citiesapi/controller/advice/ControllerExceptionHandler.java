package com.eduardo.citiesapi.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = NoSuchElementException.class)
    protected ResponseEntity<Object> createNotFoundResponse() {
        return ResponseEntity.notFound().build();
    }
}
