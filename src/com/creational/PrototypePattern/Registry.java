package com.creational.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String,Item> map = new HashMap<>();
	
	public Registry() {
		loadValues();
	}
	
	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item) map.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadValues() {
		Movie movie = new Movie();
		movie.setTitle("Star Trek");
		movie.setPrice(100);
		movie.setRunTime(60);
		movie.setUrl("netflix.com/startrek");
		map.put("movie", movie);
		
		Book book = new Book();
		book.setTitle("MCU");
		book.setPrice(150);
		book.setNumberOfPages(125);
		book.setUrl("netflix.com/MCU");
		map.put("book", book);
		
	}

	
	
}
