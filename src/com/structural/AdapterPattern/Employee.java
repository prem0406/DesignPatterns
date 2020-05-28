package com.structural.AdapterPattern;

public interface Employee {
	public int getID();
	public String getFirstName();
	public String getLastName();
	public String getEmail();
	
	@Override
	String toString();
}
