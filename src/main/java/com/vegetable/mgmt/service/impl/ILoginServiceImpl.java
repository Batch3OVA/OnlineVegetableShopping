package com.vegetable.mgmt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vegetable.mgmt.Exceptions.LoginNotValidException;
import com.vegetable.mgmt.entities.User;
import com.vegetable.mgmt.service.ILoginService;
@Service
public class ILoginServiceImpl implements ILoginService {
@Autowired
ILoginService service;
	@Override
	public String validateLogin(User user) {
		return "login with"+user.getUserId()+"successfully";
	  
   	}
}
