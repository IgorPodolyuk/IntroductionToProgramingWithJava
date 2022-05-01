package Lesson05_exercises;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		// Напишете програма, която намира най-голямото по стойност число,
		// измежду три дадени числа.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Въведете три числа: ");
		System.out.print("a = ");
		double a = input.nextDouble();
		System.out.print("b = ");
		double b = input.nextDouble();
		System.out.print("c = ");
		double c = input.nextDouble();
		
		if ((a>b)&(a>c)) {
			System.out.println("\"a\" е най-голямото число: а = " + a);
		} else if ((b>a)&(b>c)) {
			System.out.println("\"b\" е най-голямото число: b = " + b);
		} else {
			System.out.println("\"c\" е най-голямото число: c = " + c);
		}
			
	}
}
