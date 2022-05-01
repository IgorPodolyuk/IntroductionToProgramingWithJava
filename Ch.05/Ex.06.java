package Lesson05_exercises;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		// Напишете програма, която намира най-голямото по стойност число
		// измежду дадени 5 числа.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете пет различни числа: ");
		System.out.print("a = ");
		double a = input.nextDouble();
		System.out.print("b = ");
		double b = input.nextDouble();
		System.out.print("c = ");
		double c = input.nextDouble();
		System.out.print("d = ");
		double d = input.nextDouble();
		System.out.print("e = ");
		double e = input.nextDouble();
		
		if ((a>b)&(a>c)&(a>d)&(a>e)) {
			System.out.println("\"a\" е най-голямото число: а= " + a);
		} else if ((b>a)&(b>c)&(b>d)&(b>e)) {
			System.out.println("\"b\" е най-голямото число: b= " + b);
		} else if ((c>a)&(c>b)&(c>d)&(c>e)) {
			System.out.println("\"c\" е най-голямото число: c= " + c);
		} else if ((d>a)&(d>b)&(d>c)&(d>e)) {
			System.out.println("\"d\" е най-голямото число: d= " + d);
		} else {
			System.out.println("\"e\" е най-голямото число: e= " + e);
		}
		
	}
} 
