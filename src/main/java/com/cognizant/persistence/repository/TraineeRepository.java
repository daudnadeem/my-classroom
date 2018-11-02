package com.cognizant.persistence.repository;

import com.cognizant.persistence.domain.Trainee;

public interface TraineeRepository {

	String getAllTrainees();
	String createTrainee(String cr);
	String getTrainee(long id);
	String deleteTrainee(long id);
	String updateTrainee(Trainee t);
}