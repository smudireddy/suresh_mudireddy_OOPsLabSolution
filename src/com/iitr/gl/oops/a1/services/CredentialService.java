package com.iitr.gl.oops.a1.services;

import com.iitr.gl.oops.a1.model.Employee;
import java.util.Random;
import java.lang.StringBuilder;

public class CredentialService {

	private static final int passwordLen = 8;
	private static final String COMPANY_DOMAIN = "company.com";
	private static final String CREDENTIALS_DISPLAY_FORMAT = "Dear %s %s your generated credentials are as follows";

	public String generatePassword(int pwdLen) {

		final String pwdChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz~!@#$%^&*";

		Random randomGen = new Random();

		StringBuilder sb = new StringBuilder(pwdLen);

		for (int i = 0; i < pwdLen; i++) {
			sb.append(pwdChars.charAt(randomGen.nextInt(pwdChars.length())));
		}
		return sb.toString();
	}

	public String generateEmailAddress(Employee emp) {

		if (emp == null || emp.getUserID() == null) {
			return null;
		}
		return new String(emp.getUserID() + "@" + emp.getDepartment() + "." + COMPANY_DOMAIN);
	}

	public void showCredentials(Employee emp) {

		if (emp == null || emp.getFirstName() == null) {
			System.out.println("Invalid Argeumtnt - Employee is null or some info is missing");
			return;
		}

		String email = generateEmailAddress(emp);
		if (email == null) {
			System.out.println("Failed to generate email address");
			return;
		}

		String password = generatePassword(passwordLen);

		System.out.println("\n");
		System.out.printf(CREDENTIALS_DISPLAY_FORMAT, emp.getFirstName(),
				((emp.getLastName() != null) ? emp.getLastName() : ""));
		System.out.println("\nEmail ---> " + email);
		System.out.println("Password ---> " + password);
	}
}
