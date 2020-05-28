package com.creational.BuilderPattern;

public class BuilderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder b = new LunchOrder.Builder();
		
		/*
		 * we can intialize data members of inner class Builder through chain because each method
		 * is returning the instance of class. Check the method definitions of the Builder class for
		 * more clarification.
		 */
		b.bead("bread").condiments("condiments").dressing("Dressing").meat("meat");
		b.bead("Butter");
		
		/*
		 * LunchOrder() Constructor is private so we cannot create object of LunchOrder. But we can do that
		 * with the help of inner class method build(), which returs LunchOrder(Builder) constructor.
		 */
		
		LunchOrder lo = b.build();
		System.out.println(lo.getBread());
		System.out.println(lo.getCondiments());
		System.out.println(lo.getDressing());
		System.out.println(lo.getMeat());
	}

}
