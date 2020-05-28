package com.structural.composite.example2;

public class Todo implements TodoList {
	private String text;
	
	public Todo(String text) {
		this.text = text;
	}
	
	@Override
	public String getHtml() {
		return this.text;
	}

}
