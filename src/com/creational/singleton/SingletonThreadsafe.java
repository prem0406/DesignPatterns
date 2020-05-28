package com.creational.singleton;

public class SingletonThreadsafe {
	private static volatile SingletonThreadsafe instance = null;
	
	private SingletonThreadsafe() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance to create object");
		}
	}
	
	public static SingletonThreadsafe getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadsafe.class) {
				if(instance == null) {
					instance = new SingletonThreadsafe();
				}
			}
		}
		return instance;
	}

}
