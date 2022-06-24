package com.org.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
	private String name;
	private int salary;
	public TerminalOperations(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//Collect method..
		List<Integer> answer= list.stream().map(x->x*x*x).collect(Collectors.toList());
		System.out.println(answer);
		//Reduce method
		Integer reduceAnswer=list.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(reduceAnswer);
		//ForEach method
		List<Integer> numberList=Arrays.asList(1,3,5,7);
		List<String> names=Arrays.asList("Babu","Pavan","Lakshman");
		names.forEach(System.out::println);
		numberList.forEach(System.out::println);
		//AnyMatch mehod
		boolean b1=list.stream().anyMatch(num->num>9);
		System.out.println(b1);
		//non match method
		boolean b2=list.stream().noneMatch(number->number<0);
		System.out.println(b2);
		//All match method
		
		List<TerminalOperations> operatorlist=List.of(
				new TerminalOperations("Babu",1000),
				new TerminalOperations("Pavan",2000));
		//boolean b3=operatorlist.stream().allMatch(student->student.getsalary>500);
		List<Integer> numList=Arrays.asList(3,6,7,9,12,23);
		boolean answerlist=numList.stream().allMatch(n->n%3==0);
		System.out.println(answerlist);
		System.out.println();
	//	List anslist=numList.stream().forEachOrdered(s->System.out.println(s));
	}
}
