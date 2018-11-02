package com.cognizant.persistence.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import com.cognizant.persistence.domain.Classroom;
import com.cognizant.util.JsonObject;


@Alternative
public class ClassroomMapRepository implements ClassroomRepository {

	private HashMap<Long, Classroom> classroomMap = new HashMap<>();

	public void addClassroom(Classroom cr) {
		classroomMap.put(cr.getClassroomID(), cr);
	}

	public Map<Long, Classroom> getClassroom() {
		return classroomMap;
	}

	public String deleteClassroom(long classroomID) {
		classroomMap.remove(classroomID);
		return "{\"message\": \"classroom sucessfully deleted\"}";
	}

	public String mapToJson(Map<Long, Classroom> map) {
		JsonObject jo = new JsonObject();
		return jo.HashJsonString(map);
	}

	public String getAllClassrooms() {
		return mapToJson(classroomMap);
	}

	public String addClassroom(String classroom) {
		JsonObject jo = new JsonObject();
		Classroom cr = jo.JsonToObjectString(classroom);
		classroomMap.put(cr.getClassroomID(), cr);
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	public String getClassroomByID(long id) {
		JsonObject jo = new JsonObject();
		return jo.ObjectJsonString(classroomMap.get(id));
	}

	@Override
	public String createAClassroom(String classroom) {
		JsonObject jo = new JsonObject();
		Classroom cr = jo.JsonToObjectString(classroom);
		classroomMap.put(cr.getClassroomID(), cr);
		return "{\"message\": \"classroom has been sucessfully added\"}";
	}
	

}


//
//	public String updateAccount(Account acc) {
//		accountMap.get(acc.getAccountNumber()).setfName(acc.getfName());
//		accountMap.get(acc.getAccountNumber()).setlName(acc.getlName());
//		return "{\"message\": \"account has been sucessfully updated\"}";
//	}
//
//	public int countNameOccurences(String name) {
//		int count = 0;
//		Iterator it = this.accountMap.entrySet().iterator();
//		while (it.hasNext()) {
//			Map.Entry pair = (Map.Entry) it.next();
//			Account acc = (Account) pair.getValue();
//			if (name == acc.getfName())
//				count++;
//			it.remove();
//		}
//		return count;
//	}
//
//	public long countNameOccurencesStream(String name) {
//		return accountMap.entrySet().stream().filter(n -> n.getValue().getfName() == name).count();
//	}