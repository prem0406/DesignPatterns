package com.structural.AdapterPattern;

public class EmployeeCSVAdapter implements Employee {

	EmployeeCSV instance;
	public EmployeeCSVAdapter(EmployeeCSV instance) {
		this.instance = instance;
	}
	@Override
	public int getID() {
		return instance.getEid();
	}

	@Override
	public String getFirstName() {
		return instance.getFname();
	}

	@Override
	public String getLastName() {
		return instance.getLname();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}

}
