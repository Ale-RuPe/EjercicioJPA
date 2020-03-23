package com.ibm.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.jpa.entity.StudentEntity;
import com.ibm.jpa.model.RetrieveStudentResponse;
import com.ibm.jpa.model.Student;
import com.ibm.jpa.service.StudentService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author AlejandroRuizPerez
 *
 */

@RestController
@Slf4j
public class JPAController {
	@Autowired
	StudentService service;
	
	@GetMapping("/students/name")
	public ResponseEntity<RetrieveStudentResponse> findStudentByName(@RequestParam String name){
		log.info("param: {}",name);
		RetrieveStudentResponse student = service.findByName(name);
		log.info("info {}",student);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@PostMapping("/students/student")
	public ResponseEntity<StudentEntity> createStudent(@RequestBody Student student){
		log.info("createStudent {}",student);
		StudentEntity s = service.saveStudent(student);
		return new ResponseEntity<>(s, HttpStatus.OK); 
	}
	@GetMapping("/students/lastName")
	public ResponseEntity<RetrieveStudentResponse> findStudentByLastName(@RequestParam String lastName){
		log.info("param: {}",lastName);
		RetrieveStudentResponse student = service.findByLastName(lastName);
		log.info("info {}",student);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@GetMapping("/students")
	public ResponseEntity< RetrieveStudentResponse > findStudents(){
		RetrieveStudentResponse student = service.findAll();
		log.info("info {}",student);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
}
