package com.blueyonder.bookapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BookAppExceptionHandler {

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleCustomerNotFoundException() {
		return new ResponseEntity<String>("Customer doesn't exist",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserNameNotFoundException.class)
	public String handleUserNameNotFoundException() {
		return "Username not found";
	}
	
	@ExceptionHandler(PasswordMismatchException.class)
	public String handlePasswordMismatchException() {
		return "Password doesn't match";
	}
}
