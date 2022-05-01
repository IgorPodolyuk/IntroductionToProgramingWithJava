package Lesson4_exercises;

import java.util.Scanner;
import java.util.Arrays;

public class Ex07 {
	
	public static void main(String[] args) {
		// Напишете програма, която чете пет числа и 
		// отпечатва най-голямото от тях. 
		// Забележка: трябва да използвате конструкция "if", 
		// която до момента не сме разгледали.
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете пет числа.");
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
		double[] group = {a, b, c, d, e};
		Arrays.sort(group);
		System.out.println("The bigest number is: " + group[4]);
		
	}
	
}
