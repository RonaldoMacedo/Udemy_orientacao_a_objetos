package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		System.out.print("Width: ");
		rec.width = sc.nextDouble();
		System.out.print("Height: ");
		rec.height = sc.nextDouble();
		
		double area = rec.area();
		double perimeter = rec.perimeter();
		double diagonal = rec.diagonal();
		
		System.out.println();
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Perimeter: %.2f%n", perimeter);
		System.out.printf("Perimeter: %.2f", diagonal);
		
		sc.close();

	}

}
