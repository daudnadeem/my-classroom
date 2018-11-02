package com.cognizant.business.service;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.cognizant.persistence.domain.Trainee;
import com.cognizant.persistence.repository.TraineeRepository;



@Default
public class TraineeServiceImpl implements TraineeService {

	@Inject
	private TraineeRepository repo;

	public String getAllTrainees() {
		return repo.getAllTrainees();
	}

	public String createTrainee(String t) {
		return repo.createTrainee(t);
	}

	public String deleteTrainee(long id) {
		return repo.deleteTrainee(id);
	}

	public String getTrainee(long id) {
		return repo.getTrainee(id);
	}

	public String updateTrainee(Trainee t) {
		return repo.updateTrainee(t);
	}

	
	public void setRepo(TraineeRepository repo) {
		this.repo = repo;
	}


	
}
