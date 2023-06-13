package com.rubric.main;

import com.rubric.service.AdminDepartment;
import com.rubric.service.HrDepartment;
import com.rubric.service.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		AdminDepartment adDep = new AdminDepartment();
		System.out.println(adDep.getTodaysWork());
		System.out.println(adDep.getWorkDeadline());
		System.out.println(adDep.isTodayAHoliday());
		System.out.println();

		HrDepartment hrDep = new HrDepartment();
		System.out.println(hrDep.doActivity());
		System.out.println(hrDep.getTodaysWork());
		System.out.println(hrDep.getWorkDeadline());
		System.out.println(hrDep.isTodayAHoliday());
		System.out.println();
		
		
		TechDepartment techDep = new TechDepartment();
		System.out.println(techDep.getTodaysWork());
		System.out.println(techDep.getWorkDeadline());
		System.out.println(techDep.getTechStackInformation());
		System.out.println(techDep.isTodayAHoliday());
		System.out.println();

		
	}

}
