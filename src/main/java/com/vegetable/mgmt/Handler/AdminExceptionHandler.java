package com.vegetable.mgmt.Handler;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vegetable.mgmt.Exceptions.AdminEmptyException;
import com.vegetable.mgmt.Exceptions.AdminFoundException;
import com.vegetable.mgmt.Exceptions.AdminNotFoundException;
@ControllerAdvice
public class AdminExceptionHandler {
	@ExceptionHandler(AdminNotFoundException.class)
	public ResponseEntity<?> handleDuplicateEntity(AdminNotFoundException ex) {

		Map<String, Object> errorBody = new LinkedHashMap<>();
		errorBody.put("error", "Not Found");
		errorBody.put("timestamp", LocalDateTime.now());
		errorBody.put("details", ex.getMessage());

		return new ResponseEntity<Object>(errorBody, HttpStatus.BAD_REQUEST);
	}
    
	@ExceptionHandler(AdminEmptyException.class)
	public ResponseEntity<?> handleDuplicateEntity(AdminEmptyException ex) {

		Map<String, Object> errorBody = new LinkedHashMap<>();
		errorBody.put("error", "Not Found");
		errorBody.put("timestamp", LocalDateTime.now());
		errorBody.put("details", ex.getMessage());

		return new ResponseEntity<Object>(errorBody, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(AdminFoundException.class)
	public ResponseEntity<?> handleDuplicateEntity(AdminFoundException ex) {

		Map<String, Object> errorBody = new LinkedHashMap<>();
		errorBody.put("error", "Already Exists");
		errorBody.put("timestamp", LocalDateTime.now());
		errorBody.put("details", ex.getMessage());

		return new ResponseEntity<Object>(errorBody, HttpStatus.BAD_REQUEST);
	}

}

