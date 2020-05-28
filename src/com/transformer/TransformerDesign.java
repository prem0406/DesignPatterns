package com.transformer;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TransformerDesign {
	 static String naiveDropFirstWord(String string) {
	        return Arrays.asList(string.split("\\W+"))
	        		.stream()
	                   .skip(1)
	                   .collect(Collectors.joining(" "));
	                   
	    }

	    static String naiveTitleCase(String string) {
	    	
	        return Arrays.asList(string.split("\\W+"))
	                   .stream()
	                   .map(s -> s.substring(0, 1).toUpperCase() +
	                             s.substring(1).toLowerCase())
	                   .collect(Collectors.joining(" "));
	    }
	    
}
