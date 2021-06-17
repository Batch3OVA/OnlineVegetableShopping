package com.vegetable.mgmt.repository;

import org.springframework.data.repository.CrudRepository;

import com.vegetable.mgmt.entities.User;

public interface ILoginRepository extends CrudRepository<User,String>{

}
