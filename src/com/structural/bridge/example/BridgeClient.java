package com.structural.bridge.example;

public class BridgeClient {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setRuntime("02:15");
		movie.setTitle("Lucifer");
		movie.setYear("2016");
		
		Formatter printFormatter  =  new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		String str = moviePrinter.print(printFormatter);
		System.out.println(str);
		
		
	}

}
