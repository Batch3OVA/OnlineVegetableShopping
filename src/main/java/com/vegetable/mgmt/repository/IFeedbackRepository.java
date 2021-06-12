package com.vegetable.mgmt.repository;

import java.util.List;

import com.vegetable.mgmt.entities.Feedback;

public interface IFeedbackRepository {

	public Feedback addFeedback(Feedback fdk);
	public List<Feedback> viewAllFeedbacks(int vegetableId);

}
