package com.java8_feature;

import java.util.Optional;


public class OptionalClassExample {

	public static void main(String[] args) {
		Optional<String> name = Optional.ofNullable(null);

		System.out.println(name.orElse("Default Name"));
	}
}
