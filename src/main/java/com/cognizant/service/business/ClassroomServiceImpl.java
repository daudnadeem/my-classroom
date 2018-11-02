package com.cognizant.service.business;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.cognizant.persistence.repository.ClassroomRepository;

@Default
public class ClassroomServiceImpl {

	@Inject
	private ClassroomRepository repo;

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String addClassroom(String classroom) {
		return repo.createAClassroom(classroom);
	}

	public String deleteClassroom(long id) {
		return repo.deleteClassroom(id);
	}

	public String getClassroom(int id) {
		return repo.getClassroomByID(id);
	}

}
