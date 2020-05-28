package com.creational.singleton;

public class DBSingleton {
	
	/*
	 * This singleton is not lazyloaded because everytime we call getIntance method,
	 * everytime it will call the same constructor and re initialize instance with same 
	 * constructor. We can avoid this by lazy loading to make this process faster.
	 */
	private static DBSingleton instance = new DBSingleton();
		
	private DBSingleton() {}
	
	public static DBSingleton getInstance() {
		return instance;
	}
	
	

}
