package com.vegetable.mgmt.Handler;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vegetable.mgmt.Exceptions.AdminNotFoundException;
import com.vegetable.mgmt.Exceptions.LoginNotValidException;


public class LoginExceptionHandler {
	@ExceptionHandler(LoginNotValidException.class)
	public ResponseEntity<?> handleDuplicateEntity(LoginNotValidException ex) {

		Map<String, Object> errorBody = new LinkedHashMap<>();
		errorBody.put("error", "Not Valid");
		errorBody.put("timestamp", LocalDateTime.now());
		errorBody.put("details", ex.getMessage());

		return new ResponseEntity<Object>(errorBody, HttpStatus.BAD_REQUEST);
	}
}
