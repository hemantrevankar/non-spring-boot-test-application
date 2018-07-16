package com.spring.testapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
/**
 * 
 * @author hrevankar
 *  References: https://medium.com/@jovannypcg/understanding-springs-controlleradvice-cd96a364033f
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	/** Provides handling for exceptions throughout this service. */
	@ExceptionHandler({Exception.class})
    public final ResponseEntity<String> handleException(Exception ex, WebRequest request) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
