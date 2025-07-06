package com.java8_feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three");

		List<String> result = list.stream().filter(s -> s.length() > 3).collect(Collectors.toList());

		System.out.println(result);
	}
}
