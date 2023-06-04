package com.oop.main;

import java.util.HashMap;
import java.util.Scanner;
import com.oop.model.*;
import com.oop.service.CredentialService;


public class Driver {

	static void displayList() {
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");		
	}

	public static void main(String[] args) {
	    System.out.println(System.getProperty("java.runtime.version"));

		Scanner sc = new Scanner(System.in);
		Employee e = new Employee("Hugh", "Jackman");

		HashMap<Integer, String> departmentMap = new HashMap<>();
		departmentMap.put(1, "technical");
		departmentMap.put(2, "admin");
		departmentMap.put(3, "humanresource");
		departmentMap.put(4, "legal");
		
		
		displayList();
		int selectDepartment = sc.nextInt();
		CredentialService cs = new CredentialService();

//		System.out.println(selectDepartment);
		cs.generateEmailAddress(e, departmentMap.get(selectDepartment));
		cs.generatePassword();
		cs.showCredentials(e);
	}

}
