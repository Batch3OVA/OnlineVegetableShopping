package com.vegetable.mgmt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billing_details")
public class BillingDetails {
	@Id
	@Column(name = "billing_id")
	private int billingId;
	@OneToOne
	@JoinColumn(name = "order_id")
	private Order orderId;
	@Column(name = "transaction_Mode")
	private String transactionMode;
	@Column(name = "transaction_Date")
	private String transactionDate;
	@Column(name = "transaction_status")
	private String tranactionStatus;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address billingAddress;

	public int getBillingId() {
		return billingId;
	}

	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}

	public Order getOrderId() {
		return orderId;
	}

	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}

	public String getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTranactionStatus() {
		return tranactionStatus;
	}

	public void setTranactionStatus(String tranactionStatus) {
		this.tranactionStatus = tranactionStatus;
	}

}
