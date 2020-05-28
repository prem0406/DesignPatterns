package com.creational.singleton;

public class SingletonLazyLoaded {
	
	private static SingletonLazyLoaded instance = null;
		
	private SingletonLazyLoaded() {}
	
	public static SingletonLazyLoaded getInstance() {
		if (instance == null) {
			instance = new SingletonLazyLoaded();
		}
		return instance;
	}

}
