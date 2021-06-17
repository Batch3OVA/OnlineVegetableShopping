package com.vegetable.mgmt.repository;

import org.springframework.data.repository.CrudRepository;

import com.vegetable.mgmt.entities.Admin;

public interface IAdminRepository extends CrudRepository<Admin,Integer>{
	
	
}
