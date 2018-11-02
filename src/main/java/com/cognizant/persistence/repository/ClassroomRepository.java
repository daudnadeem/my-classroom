package com.cognizant.persistence.repository;

import com.cognizant.persistence.domain.Classroom;

public interface ClassroomRepository {
	
	String getAllClassrooms();
	String deleteClassroom(long id);
	String updateClassroom(Classroom cr);
	String createAClassroom(String classroom);
	String getClassroomById(long id);
	
//	String getAllTrainees();
//	String getAllTrainers();
	

}

