package Lesson4_exercises;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		// Напишете програма, която чете пет числа и отпечатва тяхната сума.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете пет числа.");
		System.out.printf("a = ");
		double a = input.nextDouble();
		System.out.printf("b = ");
		double b = input.nextDouble();
		System.out.printf("c = ");
		double c = input.nextDouble();
		System.out.printf("d = ");
		double d = input.nextDouble();
		System.out.printf("e = ");
		double e = input.nextDouble();
		System.out.println("Сумата е: " + (a + b + c + d + e));
		
	}
	
}
