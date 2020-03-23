package com.ibm.jpa.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RetrieveStudentResponse {
	private List<Student> student;
}
