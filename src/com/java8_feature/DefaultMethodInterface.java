package com.java8_feature;

interface MyInterface {
	default void show() {
		System.out.println("Default Method");
	}
}

public class DefaultMethodInterface implements MyInterface {

	public static void main(String[] args) {
		new DefaultMethodInterface().show();
	}

}
