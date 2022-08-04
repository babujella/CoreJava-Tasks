package com.org.PracticeExamples;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GetCurrencyFormatter {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur amount :");
		double payment=scanner.nextDouble();
		
		Locale indiaLocale=new Locale("en","In");
		NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		System.out.println(us.format(payment));
		System.out.println(india.format(payment));
		System.out.println(china.format(payment));
		System.out.println(france.format(payment));
	}
}
