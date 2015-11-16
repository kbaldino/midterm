package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double grade;
	
	private Enrollment() {
	}
	
	private Enrollment(UUID StudentID, UUID SectionID){
		
	this.EnrollmentID = EnrollmentID;
	
	}
	
	public void setGrade(double newGrade){
		grade = newGrade;
	}
	
}
