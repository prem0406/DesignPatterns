package com.transformer;

public class MainClass {

	public static void main(String[] args) {
		String title = "darn poor title for a book";

	    String capped = TransformerDesign.naiveTitleCase(TransformerDesign.naiveDropFirstWord(title)).concat(".");
	    System.out.println(capped);
		
//		TransformerDesign.naiveDropFirstWord(title);
	}

}
