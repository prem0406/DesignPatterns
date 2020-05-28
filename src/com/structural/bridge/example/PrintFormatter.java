package com.structural.bridge.example;

import java.util.List;

public class PrintFormatter implements Formatter {

	@Override
	public String format(String header, List<Details> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header);
		builder.append("\n");
		
		for (Details d : details) {
			builder.append(d.getLable());
			builder.append(" : ");
			builder.append(d.getValue());
			builder.append("\n");
		}
		
		return builder.toString();
	}

}
