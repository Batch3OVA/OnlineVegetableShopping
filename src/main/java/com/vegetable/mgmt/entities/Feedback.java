package com.vegetable.mgmt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback_details")
public class Feedback {
	@Id
	@Column(name = "feedback_id")
	private int feedbackId;
	@ManyToOne
	@JoinColumn(name = "cust_id")
	private Customer customerId;

	@ManyToOne
	@JoinColumn(name = "vegetable_id")
	private VegetableDTO vegetableId;

	private int rating;
	private String comments;

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Customer getCustId() {
		return customerId;
	}

	public void setCustId(Customer custId) {
		this.customerId = custId;
	}

	public VegetableDTO getVegetableId() {
		return vegetableId;
	}

	public void setVegetableId(VegetableDTO vegetableId) {
		this.vegetableId = vegetableId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
