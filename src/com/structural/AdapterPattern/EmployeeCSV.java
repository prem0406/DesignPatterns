package com.structural.AdapterPattern;

import java.util.StringTokenizer;

public class EmployeeCSV {
	private int eid;
	private String Fname;
	private String Lname;
	private String emailAddress;
	
	public EmployeeCSV(String value) {
		StringTokenizer strTokenizer = new StringTokenizer(value, ",");
		
		if (strTokenizer.hasMoreTokens()) {
			eid = Integer.parseInt(strTokenizer.nextToken());
		}
		if (strTokenizer.hasMoreTokens()) {
			Fname = strTokenizer.nextToken();
		}
		if (strTokenizer.hasMoreTokens()) {
			Lname = strTokenizer.nextToken();
		}
		if (strTokenizer.hasMoreTokens()) {
			emailAddress = strTokenizer.nextToken();
		}
	}
	
	public int getEid() {
		return eid;
	}
	public String getFname() {
		return Fname;
	}
	public String getLname() {
		return Lname;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
}
