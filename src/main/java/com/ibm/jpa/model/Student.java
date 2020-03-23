package com.ibm.jpa.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author AlejandroRuizPerez
 *
 */

@Getter
@Setter
public class Student {
	/**
	 * The name of the student
	 */
	private String name;
	/**
	 * The last name of the student
	 */
	private String lastName;
	/**
	 * The age of the student
	 */
	private int age;
	
	private Company company;
	private Country city;
}
