package com.ibm.jpa.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author AlejandroRuizPerez
 *
 */
@Getter
@Setter
public class CompanyEntity{
	/**
	 * Column company
	 */
	@Field("company")
	private String name;
	
}
