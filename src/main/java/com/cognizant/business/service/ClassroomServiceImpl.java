package com.cognizant.business.service;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.cognizant.persistence.repository.ClassroomRepository;



@Default
public class ClassroomServiceImpl implements ClassroomService {

	@Inject
	private ClassroomRepository repo;

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String createClassroom(String cr) {
		return repo.createAClassroom(cr);
	}

	public String deleteClassroom(long id) {
		return repo.deleteClassroom(id);
	}

	public String getClassroomByID(Long id) {
		return repo.getClassroomById(id);
	}

	
	public void setRepo(ClassroomRepository repo) {
		this.repo = repo;
	}



}
