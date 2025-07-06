package com.java8_feature;

public class LambdaExpression {

	public static void main(String[] args) {

		// Lambda way
		Runnable r = () -> System.out.println("Running...");

		r.run();
	}

}
/*
 * Java 8 introduced a new way of writing short blocks of code.
 * 
 * Used for functional programming. Use: To reduce boilerplate code (especially
 * with interfaces that have one method like Runnable, Comparator, etc.)
 */
