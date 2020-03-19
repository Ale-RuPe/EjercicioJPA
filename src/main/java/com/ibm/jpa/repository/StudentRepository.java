package com.ibm.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.jpa.entity.StudentEntity;
/**
 * 
 * @author AlejandroRuizPerez
 *
 */
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	StudentEntity findByName(String name);
	
	StudentEntity findByLastName(String lastName);
	
	List<StudentEntity> findAll();
}
