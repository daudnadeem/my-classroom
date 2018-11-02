package com.cognizant.business.service;


public interface ClassroomService {

	String getAllClassrooms();
	
	String createClassroom(String cr);

	String deleteClassroom(long id);

	String getClassroomByID(Long id);


}
