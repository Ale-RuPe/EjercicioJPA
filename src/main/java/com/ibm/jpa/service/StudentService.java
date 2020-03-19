package com.ibm.jpa.service;

import java.util.List;

import com.ibm.jpa.entity.StudentEntity;

public interface StudentService {
	StudentEntity findByName(String name);
	
	StudentEntity findByLastName(String name);
	
	List<StudentEntity> findAll();
	
	StudentEntity saveStudent(StudentEntity student);
}


