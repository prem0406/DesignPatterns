package com.structural.composite.example2;

import java.util.List;

public class Project implements TodoList {
	
	private String title;
	private List<TodoList> todos;
	
	
	
	public Project(String title, List<TodoList> todos) {
		this.title = title;
		this.todos = todos;
	}



	@Override
	public String getHtml() {
		String html = "<h1>";
		
		html += title;
		
		html += "</h1> \n<ul> \n";
		
		for (TodoList t: this.todos) {
			html += "<li>";
			
			html += t.getHtml();
			
			html += "</li>\n";
		}
		
		html += "</ul>";
		
		return html;
	}

}
