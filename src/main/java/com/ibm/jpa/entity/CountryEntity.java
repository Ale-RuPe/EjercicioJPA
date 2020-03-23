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
public class CountryEntity{
	/**
	 * Column city
	 */
	@Field("city")
	private String name;

}
