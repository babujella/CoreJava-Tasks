package com.org.Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeApi {
	public static void main(String[] args) {
		LocalDate presentdate=LocalDate.now();
		System.out.println(presentdate);
		LocalTime presentTime=LocalTime.now();
		System.out.println(presentTime);
		LocalDateTime prsenttimeapi=LocalDateTime.now();
		System.out.println(prsenttimeapi);
	}
}
