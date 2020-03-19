package com.ibm.jpa.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author AlejandroRuizPerez
 *
 */

@Entity
@Table(name="company")
@Getter
@Setter
public class CompanyEntity implements Serializable{
	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Company Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private int id;
	/**
	 * Column company
	 */
	@Column(name = "name")
	private String name;
	
}