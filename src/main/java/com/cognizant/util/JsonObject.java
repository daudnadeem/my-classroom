package com.cognizant.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import com.cognizant.persistence.domain.Classroom;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObject {
	
	private ObjectMapper mapper;
	
	public JsonObject() {
		mapper = new ObjectMapper();
	}
	
	public void ObjectJsonFile(Classroom cr) {
		
		try {
			mapper.writeValue(new File("c:\\file.json"), cr);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String HashJsonString(Map<Long, Classroom> map) {
		try {
			String stringToJson = mapper.writeValueAsString(map);
	    	return stringToJson; 
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Error occured, see console";
	
	}
	
	
	public String ObjectJsonString(Classroom cr) {
		
		try {
			String stringToJson = mapper.writeValueAsString(cr);
	    	return stringToJson; 
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Error occured, see console";
	}
	
	public Classroom JsonToObjectFile(String File) {
		Classroom cr;
		try {
			cr = mapper.readValue(new File(File), Classroom.class);
			return cr;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Classroom();
	}
	
	public Classroom JsonToObjectURL(String URL) {
		Classroom acc;
		try {
			acc = mapper.readValue(new URL(URL), Classroom.class);
			return acc;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Classroom();
	}
	
	public Classroom JsonToObjectString(String Json) {
		Classroom acc;
		try {
			acc = mapper.readValue(Json, Classroom.class);
			return acc;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Classroom();
	}
	

	
	
	public ObjectMapper getMapper() {
		return mapper;
	}

	public void setMapper(ObjectMapper mapper) {
		this.mapper = mapper;
	}
	
	
}
