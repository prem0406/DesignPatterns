package com.structural.DecoratorPattern;

public class DecoratorSandwichDemo {

	public static void main(String args[]) {
//		Sandwich sandwich = new SimpleSandwich();
//		Sandwich sandwich = new MeatDecorator(new SimpleSandwich());
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		
		System.out.println(sandwich.make());
	}
}
