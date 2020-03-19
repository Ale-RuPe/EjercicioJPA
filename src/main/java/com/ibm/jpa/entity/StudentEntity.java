package com.ibm.jpa.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ibm.jpa.constants.Constants;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author AlejandroRuizPerez
 *
 */
@Entity
@Table(name=Constants.STUDENT_TABLE)
@Getter
@Setter
public class StudentEntity implements Serializable{
	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Student Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = Constants.STUDENT_ID)
	private int id;
	/**
	 * Column name
	 */
	@Column(name = Constants.STUDENT_NAME)
	private String name;
	/**
	 * Column lastName
	 */
	@Column(name = Constants.STUDENT_LASTNAME)
	private String lastName;
	/**
	 * Column age
	 */
	@Column(name = Constants.STUDENT_AGE)
	private int age;
	/**
	 * Column date of birth
	 */
	@Column(name = Constants.STUDENT_BIRTHDATE)
	private Date birthDate;
	/**
	 * Many to one company
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = Constants.STUDENT_COMPANY_ID)
	private CompanyEntity company;
	/**
	 * Many to one city
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = Constants.STUDENT_COUNTRY_ID)
	private CountryEntity country;
	
}
