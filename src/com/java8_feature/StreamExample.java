package com.java8_feature;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "avocado");

		list.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
	}
}
