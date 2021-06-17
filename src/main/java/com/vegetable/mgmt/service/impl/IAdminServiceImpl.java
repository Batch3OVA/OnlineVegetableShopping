package com.vegetable.mgmt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.checkerframework.checker.nullness.Opt;
import com.vegetable.mgmt.Exceptions.AdminEmptyException;
import com.vegetable.mgmt.Exceptions.AdminFoundException;
import com.vegetable.mgmt.Exceptions.AdminNotFoundException;
import com.vegetable.mgmt.entities.Admin;
import com.vegetable.mgmt.repository.IAdminRepository;
import com.vegetable.mgmt.service.IAdminService;
@Service
public class IAdminServiceImpl implements IAdminService{
@Autowired
IAdminRepository adminrepo;
	@Override
	public String addAdmin(Admin admin) {
		// TODO Auto-generated method stub
   Optional<Admin> opt=adminrepo.findById(admin.getAdminId());
		if (opt.isPresent()) 
			throw new AdminFoundException("Admin already exist");
	        
		adminrepo.save(admin);
	       return "Admin saved successfully";
	     
	}
				

	@Override
	public String updateAdminDetails(Admin admin,int adminid) {
		Optional<Admin> opt=adminrepo.findById(adminid);

		if (!(opt.isPresent())) 
			throw new AdminNotFoundException( "Admin not found to update");
		Admin admin2=
		opt.get();
		admin2.setAdminId(adminid); 
		admin2.setName(admin.getName());
		admin2.setContactNumber(admin.getContactNumber());
		    adminrepo.save(admin);
			return  "updated sucessfully";
	}

	@Override
	public String removeAdmin(int adminId) {
		adminrepo.deleteById(adminId);
			return "Admin is deleted sucessfully";
		
	}

	@Override
	public List<Admin> viewAdmin() {
		List<Admin> list=(List<Admin>) adminrepo.findAll();
		return list;
		
	
	}
	@Override
		public Admin viewAdminDetails(int adminId) {
			return adminrepo.findById(adminId).orElseThrow(()->new AdminNotFoundException("Admin Not Found"));
		}
	

}
