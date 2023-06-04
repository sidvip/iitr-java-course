package com.oop.service;

import java.util.Random;

import com.oop.interfaces.ICredentials;
import com.oop.model.Employee;

public class CredentialService implements ICredentials {

	private String email = "";
	private String password = "";

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		// TODO Auto-generated method stub
		this.email = employee.getFirstName() + employee.getLastName() + "@" + 
				department + ".abc.com";
		return employee.getFirstName() + employee.getLastName() + "@" + 
				department + ".abc.com";
	}

	private String _generatePassword(int passwordStrength, String password) {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String val = capitalLetters + smallLetters + numbers + specialCharacters;
		Random r = new Random();
		if (passwordStrength == 0) {
			return password;
		}
		
		String newSampledChar = String.valueOf(val.charAt(r.nextInt(val.length())));
		return password = password + _generatePassword(passwordStrength - 1, newSampledChar);
	}
	
	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		this.password = this._generatePassword(8, this.password);
		return this.password;
	}

	@Override
	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Dear Employee: " + employee.getFirstName());
		System.out.println("Email: " + this.email);
		System.out.println("Password: " + this.password);
	}

}
