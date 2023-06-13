package com.rubric.service;

public class AdminDepartment extends SuperDepartment {
	
	public AdminDepartment() {
		System.out.println("Welcome to Admin Department");
	}

	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
}
