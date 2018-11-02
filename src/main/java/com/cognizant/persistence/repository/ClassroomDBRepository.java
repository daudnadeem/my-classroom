package com.cognizant.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.cognizant.persistence.domain.Classroom;
import com.cognizant.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepository implements ClassroomRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllClassrooms() {
		Query query = manager.createQuery("Select a FROM Classroom a");
		Collection<Classroom> classrooms = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(classrooms);
	}

	@Transactional(REQUIRED)
	public String createAClassroom(String classroom) {
		Classroom aClassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(aClassroom);
		return "{\"message\": \"movie has been sucessfully added\"}";
	}

	@Transactional(REQUIRED)
	private Classroom findClassroom(Long id) {
		return manager.find(Classroom.class, id);
	}

	public String deleteClassroom(long id) {
		Classroom classroomInDB = findClassroom(id);
		if (classroomInDB != null) {
			manager.remove(classroomInDB);
		}
		return "{\"message\": \"classroom sucessfully deleted\"}";
	}

	public String getClassroomByID(long id) {
		Classroom classroomInDB = findClassroom(id);
		return util.getJSONForObject(classroomInDB);
	}



//	public String getAllTrainees() {
//		return null;
//	}
//
//	public String getAllTrainers() {
//		return null;
//	}

}
