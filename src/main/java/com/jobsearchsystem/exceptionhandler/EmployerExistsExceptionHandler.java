package com.jobsearchsystem.exceptionhandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jobsearchsystem.exception.EmployerAlreadyExistException;
@ControllerAdvice
public class EmployerExistsExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value 
		      = { EmployerAlreadyExistException.class })
		    protected ResponseEntity<Object> handleConflict(
		      RuntimeException ex, WebRequest request) {
		        String bodyOfResponse = "User with this userName already exist please use different userName";
		        return handleExceptionInternal(ex, bodyOfResponse, 
		          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
		    }
}