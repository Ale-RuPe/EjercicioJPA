package com.ibm.jpa.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author AlejandroRuizPerez
 *
 */
@Document(collection = "students")
@Getter
@Setter
public class StudentEntity{
	/**
	 * Column ID
	 */
	@Field("_id")
	private ObjectId id;
	/**
	 * Column name
	 */
	@Field("nombre")
	private String name;
	/**
	 * Column lastName
	 */
	@Field("apellido")
	private String lastName;
	/**
	 * Column age
	 */
	@Field("edad")
	private int age;
	/**
	 * Many to one company
	 */
	@Field("company")
	private CompanyEntity company;
	/**
	 * Many to one city
	 */
	@Field("city")
	private CountryEntity city;
	
	@Field("companies")
	private List<CompanyEntity> companies;
	
}
