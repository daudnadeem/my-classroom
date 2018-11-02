package com.cognizant.persistence.repository;

import com.cognizant.persistence.domain.Classroom;

public interface ClassroomRepository {
	
	String getAllClassrooms();
	String createAClassroom(String classroom);
	String deleteClassroom(long id);
	String getClassroomByID(long id);
	
//	String getAllTrainees();
//	String getAllTrainers();
	

}

