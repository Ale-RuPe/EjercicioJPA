package com.ibm.jpa.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.ibm.jpa.entity.StudentEntity;
import com.ibm.jpa.repository.CustomStudentRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author AlejandroRuizPerez
 *
 */
@Slf4j
public class CustomStudentRepositoryImpl implements CustomStudentRepository{
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<StudentEntity> findByName(String name) {
		log.info("repo:{}",name);
		Criteria criteria = new Criteria().andOperator( 
				Criteria.where("nombre").is(name) );
		Query query = new Query(criteria);
		
		List<StudentEntity> mongoResponse = mongoTemplate.find( 
				query.with( Sort.by( Sort.Direction.ASC, "_id") ), 
				StudentEntity.class );
		
		return mongoResponse;
	}

	@Override
	public List<StudentEntity> findByLastName(String lastName) {
		log.info("repo:{}",lastName);
		Criteria criteria = new Criteria().andOperator( 
				Criteria.where("apellido").is(lastName) );
		Query query = new Query(criteria);
		
		List<StudentEntity> mongoResponse = mongoTemplate.find( 
				query.with( Sort.by( Sort.Direction.ASC, "_id") ), 
				StudentEntity.class );
		
		return mongoResponse;
	}

	@Override
	public List<StudentEntity> findAll() {
		log.info("repo:{}","findAll");
		
		List<StudentEntity> mongoResponse = mongoTemplate.findAll(StudentEntity.class, "students");
		return mongoResponse;
	}
	
	@Override
	public StudentEntity saveStudent(StudentEntity student) {
		log.info("repo:{}",student);
		return mongoTemplate.save(student, "students");
	}
	
}
