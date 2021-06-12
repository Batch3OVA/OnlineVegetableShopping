package com.vegetable.mgmt.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart_dto")
public class CartDTO {
	@Id
	@Column(name = "cart_id")
	private int cartId;

	@OneToOne
	@JoinColumn(name = "cust_id")
	private Customer customerId;

	@OneToMany
	@JoinTable(name = "cart_veg_link", joinColumns = @JoinColumn(name = "cart_id"), inverseJoinColumns = @JoinColumn(name = "veg_id"))
	private List<VegetableDTO> vegetables = new ArrayList<VegetableDTO>();

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public List<VegetableDTO> getVegetables() {
		return vegetables;
	}

	public void setVegetables(List<VegetableDTO> vegetables) {
		this.vegetables = vegetables;
	}

}

