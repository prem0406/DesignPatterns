package com.behavioral.observer.pluralsight;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
