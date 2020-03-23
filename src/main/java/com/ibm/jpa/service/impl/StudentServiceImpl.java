package com.ibm.jpa.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.jpa.entity.CompanyEntity;
import com.ibm.jpa.entity.CountryEntity;
import com.ibm.jpa.entity.StudentEntity;
import com.ibm.jpa.model.Company;
import com.ibm.jpa.model.Country;
import com.ibm.jpa.model.RetrieveStudentResponse;
import com.ibm.jpa.model.Student;
import com.ibm.jpa.repository.StudentRepository;
import com.ibm.jpa.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repository;
	/**
	 * Method to find by name
	 * @param name
	 * @return
	 */
	@Override
	public RetrieveStudentResponse findByName(String name) {
		log.info("findByName");
		List<StudentEntity> mongoResponse = repository.findByName(name); 
		RetrieveStudentResponse response = new RetrieveStudentResponse();
		response.setStudent(  
				mongoResponse.stream().map(this::createStudent).collect(Collectors.toList()) );
		return response;
	}

	@Override
	public RetrieveStudentResponse findByLastName(String lastName) {
		log.info("findByLastName");
		List<StudentEntity> mongoResponse = repository.findByLastName(lastName); 
		RetrieveStudentResponse response = new RetrieveStudentResponse();
		response.setStudent(  
				mongoResponse.stream().map(this::createStudent).collect(Collectors.toList()) );
		return response;
	}

	@Override
	public RetrieveStudentResponse findAll() {
		log.info("findByLastName");
		List<StudentEntity> mongoResponse = repository.findAll(); 
		RetrieveStudentResponse response = new RetrieveStudentResponse();
		response.setStudent(  
				mongoResponse.stream().map(this::createStudent).collect(Collectors.toList()) );
		return response;
	}

	@Override
	public StudentEntity saveStudent(Student student) {
		log.info("saveStudent");
		return repository.saveStudent( createStudentEntity(student) );
	}
	
	private Student createStudent(StudentEntity entity) {
		Student student = new Student();
		student.setName(entity.getName());
		student.setLastName(entity.getLastName());
		student.setAge(entity.getAge());
		
		Company company = new Company();
		if(entity.getCompany()!=null) {
			company.setName(entity.getCompany().getName());
		}
		
		Country country = new Country();
		country.setName(entity.getCity().getName());
		student.setCompany(company);
		student.setCity(country);
		
		return student;
	}
	
	private StudentEntity createStudentEntity(Student student) {
		StudentEntity entity = new StudentEntity();
		entity.setName(student.getName());
		entity.setLastName(student.getLastName());
		entity.setAge(student.getAge());
		CompanyEntity company = new CompanyEntity();
		company.setName(student.getCompany().getName());
		
		CountryEntity city = new CountryEntity();
		city.setName(student.getCity().getName());
		
		entity.setCompany(company);
		entity.setCity(city);
		return entity;
	}
}
