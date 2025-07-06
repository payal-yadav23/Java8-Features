package com.java8_feature;

import java.util.Arrays;
import java.util.List;

public class MethodRefExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "C++");
		list.forEach(System.out::println); // Method reference
	}
}
