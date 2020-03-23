package com.ibm.jpa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.jpa.entity.StudentEntity;

/**
 * 
 * @author AlejandroRuizPerez
 *
 */

public interface StudentRepository extends MongoRepository<StudentEntity, String>, CustomStudentRepository{

}
