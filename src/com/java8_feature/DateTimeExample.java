package com.java8_feature;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeExample {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();

		System.out.println("Date: " + date);
		System.out.println("Time: " + time);
	}
}
