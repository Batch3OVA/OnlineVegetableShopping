package com.vegetable.mgmt.repository;

import com.vegetable.mgmt.entities.Admin;

public interface IAdminRepository {
	public Admin addAdmin(Admin admin);
	public Admin updateAdminDetails(Admin admin);
	public Admin removeAdmin(Admin admin);
	public Admin viewAdmin(Admin admin);
	
}
