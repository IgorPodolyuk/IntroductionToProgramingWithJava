package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// Напишете програма, която преобразува дадено число от десетична в двоична бройна система.
		Scanner scanner = new Scanner(System.in);
		double n = -1;
		while (n < 0 || n % 1 != 0) {
		System.out.print("Въведете едно цяло положително число = ");
		n = scanner.nextDouble();
		}
		System.out.printf("%,.0f",n);
		System.out.println("(10) = " + Integer.toBinaryString( (int) n ) + "(2)");
		
	}

}
