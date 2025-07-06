package com.java8_feature;

interface Greet {
	void Hello();
}

public class FunctionalInterface {

	public static void main(String[] args) {

		Greet g = () -> System.out.println("Hello Functional Interface..");

		g.Hello();

	}

}
