package Lesson4_exercises;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Напишете програма, която чете от конзолата радиуса "r" на кръг и отпечатва неговия периметър и обиколка.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle: ");
		System.out.print("r = ");
		double r = input.nextDouble();
		double perimeter = 2*Math.PI*r;
		System.out.printf("The circle perimeter is: %.2f%n", perimeter);
		double area = Math.PI*r*r;
		System.out.printf("The circle area is: %.2f%n", area);

	}

}
