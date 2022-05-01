package Lesson4_exercises;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Напишете програма, която чете от конзолата две цели числа 
		// (integer) и отпечатва, колко числа има между тях, 
		// такива, че остатъкът им от деленето на 5 да е 0.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Намерете всички числа, които се делят на 5 без остатък между две дадени числа.");
		System.out.println("Въведете две цели числа.");
		System.out.print("a = ");
		int a = input.nextInt();
		System.out.print("b = ");
		int b = input.nextInt();
		System.out.println("Числата между а = " + a + " и b = " + b + ", които се делят на 5 без остатък са: ");
		for (int i=a+1; i<b; i++) {
			if (i % 5 == 0)
				System.out.printf("%d; ",i);
		}
		
	}

}
