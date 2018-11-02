package com.cognizant.persistence.domain;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long classroomID;
	private String trainer;
	@OneToMany
	private HashMap<Integer,String> trainees = new HashMap<Integer,String>();  
	
	public Classroom() {
		
	}
	
	public Classroom(long classroomID, String trainer, HashMap<Integer,String> trainees) {
		this.classroomID = classroomID;
		this.trainer = trainer;
		this.trainees = trainees;
	}

	public long getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(long classroomID) {
		this.classroomID = classroomID;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public HashMap<Integer, String> getTrainees() {
		return trainees;
	}

	public void setTrainees(HashMap<Integer, String> trainees) {
		this.trainees = trainees;
	}
}
