package com.ibm.jpa.service;

import com.ibm.jpa.entity.StudentEntity;
import com.ibm.jpa.model.RetrieveStudentResponse;
import com.ibm.jpa.model.Student;

public interface StudentService {
	RetrieveStudentResponse findByName(String name);
	
	RetrieveStudentResponse findByLastName(String name);
	
	RetrieveStudentResponse findAll();
	
	StudentEntity saveStudent(Student student);
}


