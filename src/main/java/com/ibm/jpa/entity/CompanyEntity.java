package com.ibm.jpa.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = Constants.COMPANY_TABLE)
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
	@Column(name = Constants.COMPANY_ID)
	private int id;
	/**
	 * Column company
	 */
	@Column(name = Constants.COMPANY_NAME)
	private String name;
	
}
