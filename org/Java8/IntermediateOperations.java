package com.org.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
	public static void main(String[] args) {
		//Intermediate operation-- DISTINCT
		List<String> fruits= Arrays.asList("Apple","Grapes","Mango");
		Stream<String> fruitsdistinct=fruits.stream().distinct();
		fruitsdistinct.forEach(System.out::println);
		//Limit method
		Stream.of("Babu","Aishu","Raju","Venky").limit(3).forEach(System.out::println);
		//((Stream<String>) fruits).limit(2).forEach(item->System.out.println(item));
		//Peek method
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
		  .peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
		  .peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
	}
}
