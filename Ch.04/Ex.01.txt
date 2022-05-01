package Lesson4_exercises;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Напишете програма, която чете от конзолата три числа от тип int и отпечатва тяхната сума.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input three whole numbers: ");
		System.out.print("a = ");
		int a = input.nextInt();
		System.out.print("b = ");
		int b = input.nextInt();
		System.out.print("c = ");
		int c = input.nextInt();
		System.out.print("The sum of a + b + c = " + (a+b+c));		

	}

}
