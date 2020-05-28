package com.creational.PrototypePattern;

public class PrototypeDemo {
	
	public static void main(String... args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("movie");
		System.out.println(movie.getTitle());
		System.out.println(movie.getPrice());
		System.out.println(movie.getRunTime());
		System.out.println(movie.getUrl());
		
		movie.setTitle("Star Wars");
		
		System.out.println(movie);
		
		Movie anotheMovie = (Movie) registry.createItem("movie");
		System.out.println(anotheMovie);	

	}

}
		