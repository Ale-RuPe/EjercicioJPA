package com.ibm.jpa.repository;

import java.util.List;

import com.ibm.jpa.entity.StudentEntity;

public interface CustomStudentRepository {
	List<StudentEntity> findByName(String name);
	
	List<StudentEntity> findByLastName(String lastName);
	
	List<StudentEntity> findAll();
	
	StudentEntity saveStudent(StudentEntity student);
}
