package com.structural.AdapterPattern;

public class EmployeeAdapter implements Employee {
	private EmployeeADB instance;
	
	public EmployeeAdapter(EmployeeADB instance) {
		this.instance = instance;
	}
	
	@Override
	public int getID() {
		return instance.getEid();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return instance.getSurName();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}
	
	public String toString() {
		return "EmployeeDB [id=" + getID() + ", firstName=" + getFirstName()
		+ ", lastName=" + getLastName()
		+ ", email=" + getEmail()
				+ "]";
	}

}
