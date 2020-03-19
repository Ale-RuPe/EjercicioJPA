package com.ibm.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.jpa.entity.StudentEntity;
import com.ibm.jpa.repository.StudentRepository;
import com.ibm.jpa.service.StudentService;
/**
 * 
 * @author AlejandroRuizPerez
 *
 */
@Service
public class StudentDao implements StudentService{
	@Autowired 
	private StudentRepository studentRepository;
	
	/**
	 * Method to find by name
	 * @param name
	 * @return
	 */
	public StudentEntity findByName(String name) {
		return studentRepository.findByName(name);
	}
	/**
	 * Method to find by last name
	 * @param lastName
	 * @return
	 */
	public StudentEntity findByLastName(String lastName) {
		return studentRepository.findByLastName(lastName);
	}
	/**
	 * Method to find all the students
	 * @return
	 */
	public List<StudentEntity> findAll(){
		return studentRepository.findAll();
	}
	/**
	 * Method to save a student
	 * @param student
	 * @return
	 */
	public StudentEntity saveStudent(StudentEntity student) {
		return studentRepository.save(student);
	}
}
