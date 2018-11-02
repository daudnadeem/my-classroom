package com.cognizant.business.service;

import com.cognizant.persistence.domain.Trainee;

public interface TraineeService {

	String getAllTrainees();
	String createTrainee(String cr);
	String getTrainee(long id);
	String deleteTrainee(long id);
	String updateTrainee(Trainee t);
	
}
