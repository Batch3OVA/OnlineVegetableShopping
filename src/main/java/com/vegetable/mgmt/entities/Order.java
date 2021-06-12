package com.vegetable.mgmt.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class Order {
	@Id
	@Column(name = "order_id")
	private int orderId;

	@ManyToOne
	@JoinColumn(name = "cust_id")
	private Customer customerId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "order_veg_link", joinColumns = @JoinColumn(name="order_id"), inverseJoinColumns = @JoinColumn(name="veg_id"))
	private List<VegetableDTO> vegList = new ArrayList<>();

	@Column(name = "total_Amount")
	private double totalAmount;
	@Column(name = "order_Date")
	private LocalDate orderDate;
	private String status;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderNo(int orderId) {
		this.orderId = orderId;
	}

//	public Customer getCustId() {
//		return customerId;
//	}
//
//	public void setCustId(Customer custId) {
//		this.customerId = custId;
//	}

//	public List<VegetableDTO> getVegList() {
//		return vegList;
//	}
//
//	public void setVegList(List<VegetableDTO> vegList) {
//		this.vegList = vegList;
//	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
