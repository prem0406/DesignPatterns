package com.structural.AdapterPattern;

public class EmployeeADB {
	private int eid;
	private String givenName;
	private String surName;
	private String mail;
	
	public EmployeeADB(int eid, String givenName, String surName, String mail) {
		this.eid = eid;
		this.givenName = givenName;
		this.surName = surName;
		this.mail = mail;
	}
	
	public int getEid() {
		return eid;
	}
	public String getGivenName() {
		return givenName;
	}
	public String getSurName() {
		return surName;
	}
	public String getMail() {
		return mail;
	}
	
	
}
