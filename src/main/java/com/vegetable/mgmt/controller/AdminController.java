package com.vegetable.mgmt.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vegetable.mgmt.entities.Admin;

@RestController
@Configuration
public class AdminController {

	@GetMapping("/view-admin")
	public Admin viewAdmin(@RequestBody Admin admin) {
		Admin viewAdmin = new Admin();
		viewAdmin.setAdminId(123);
		return viewAdmin;

	}

}
