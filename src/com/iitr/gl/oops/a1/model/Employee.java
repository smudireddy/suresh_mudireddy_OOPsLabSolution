package com.iitr.gl.oops.a1.model;

public class Employee {

	private static final String DEFAULT_DEPARTMENT = "tech";  

	private String firstName;
	private String lastName;
	private String department;

	public Employee(String firstName, String lastName, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;

		if(department == null) {
			this.department = DEFAULT_DEPARTMENT;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUserID() {

		if(this.firstName == null) {
			return null;
		}
		return new String(this.firstName + ((this.lastName != null)?this.lastName : ""));
	}	
}
