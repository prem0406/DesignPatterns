package com.structural.bridge.example;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

	Movie movie;
	
	MoviePrinter(Movie movie){
		this.movie = movie;
	}
	@Override
	protected String getHeader() {
		return movie.getClassification();
	}

	@Override
	protected List<Details> getDetails() {
		ArrayList<Details> details = new ArrayList<>();
		details.add(new Details("Title", movie.getTitle()));
		details.add(new Details("Year", movie.getYear()));
		details.add(new Details("RunTime", movie.getRuntime()));
		
		return details;
	}

}
