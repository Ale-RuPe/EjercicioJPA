package com.ibm.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.jpa.entity.StudentEntity;
import com.ibm.jpa.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class JPAController {
	@Autowired
	StudentService service;
	
	@GetMapping("/students/name")
	public ResponseEntity<StudentEntity> findStudentByName(@RequestParam String name){
		log.info("param: {}",name);
		StudentEntity student = service.findByName(name);
		log.info("info {}",student);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@GetMapping("/students/lastName")
	public ResponseEntity<StudentEntity> findStudentByLastName(@RequestParam String lastName){
		log.info("param: {}",lastName);
		StudentEntity student = service.findByLastName(lastName);
		log.info("info {}",student);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public ResponseEntity< List<StudentEntity> > findStudents(){
		List<StudentEntity> student = service.findAll();
		log.info("info {}",student);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
}
