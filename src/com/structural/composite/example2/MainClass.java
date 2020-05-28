package com.structural.composite.example2;

import java.util.Arrays;

public class MainClass {
	public static void main(String ...args) {
		TodoList t1 = new Todo("Single Item");
		TodoList t2 = new Todo("Another Single Item");
		
		TodoList p = new Project("First Project", Arrays.asList(t1, t2));
		
		TodoList t3 = new Todo("Item For second project");
		TodoList t4 = new Todo("Another Item for second Project");
		
		TodoList p2 = new Project("Second Project", Arrays.asList(t3, t4));
		
		TodoList p3 = new Project("Third Project", Arrays.asList(p, p2));
		
//		System.out.println(p.getHtml());
		System.out.println(p3.getHtml());
	}
}
