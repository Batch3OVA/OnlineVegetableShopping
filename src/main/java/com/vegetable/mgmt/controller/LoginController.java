package com.vegetable.mgmt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vegetable.mgmt.entities.Admin;
import com.vegetable.mgmt.entities.User;
import com.vegetable.mgmt.service.impl.IAdminServiceImpl;
import com.vegetable.mgmt.service.impl.ILoginServiceImpl;

@RestController
@RequestMapping("Login")
@Configuration
public class LoginController {
	@Autowired
	ILoginServiceImpl service;
		@PostMapping()
		public ResponseEntity<?> getValidateLogin(@Valid User user){
			return new ResponseEntity<String> (service.validateLogin(user),HttpStatus.CREATED);
			
		}
	
		}


