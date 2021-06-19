package com.vegetable.mgmt.controller;

import java.util.List;

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
import com.vegetable.mgmt.service.impl.IAdminServiceImpl;

@RestController
@RequestMapping("/Admin")
@Configuration
public class AdminController {
@Autowired
IAdminServiceImpl service;
//save admin
	@PostMapping()
	public ResponseEntity<?> getAddAdmin(@RequestBody Admin admin){
		return new ResponseEntity<String> (service.addAdmin(admin),HttpStatus.CREATED);
		
	}
	//update admin //
	@PutMapping("{adminId}")
	public ResponseEntity<?> getUpdateAdminDetails(@RequestBody Admin admin,@PathVariable int adminId){
		return new ResponseEntity<String> (service.updateAdminDetails(admin,adminId),HttpStatus.ACCEPTED);
		}
	//delete admin//
	@DeleteMapping("{adminId}")
	public ResponseEntity<?> getRemoveAdmin(@PathVariable int adminId){
		return new ResponseEntity<String>(service.removeAdmin(adminId),HttpStatus.OK);
	}
	@GetMapping()
	public List<Admin> getViewAdmin(){
		return service.viewAdmin();
	}
	@GetMapping("{adminId}")
	public Admin ViewAdmin(@PathVariable int adminId){
		return service.viewAdminDetails(adminId);
	}

}

