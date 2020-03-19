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

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author AlejandroRuizPerez
 *
 */
@Entity
@Table(name="student")
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
	@Column(name = "student_id")
	private int id;
	/**
	 * Column name
	 */
	@Column(name = "name")
	private String name;
	/**
	 * Column lastName
	 */
	@Column(name = "last_name")
	private String lastName;
	/**
	 * Column age
	 */
	@Column(name = "age")
	private int age;
	/**
	 * Column date of birth
	 */
	@Column(name = "birth_date")
	private Date birthDay;
	/**
	 * Many to one company
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="company_id")
	private CompanyEntity company;
	/**
	 * Many to one city
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="country_id")
	private CountryEntity country;
	
}
