package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
		
		System.out.println();
		System.out.println("Amount to be paid in reais: " + CurrencyConverter.real(dollar, dollarPrice));
		
		sc.close();

	}

}
