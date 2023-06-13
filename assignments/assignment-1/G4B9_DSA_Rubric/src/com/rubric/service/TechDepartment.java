package com.rubric.service;

public class TechDepartment extends SuperDepartment {
	
	public TechDepartment() {
		System.out.println("Welcome to Tech Department");
	}
	
	public String departmentName() {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "Core Java";
	}
}
