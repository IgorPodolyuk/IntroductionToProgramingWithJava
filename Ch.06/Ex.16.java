package Lesson06_Cikli_exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// Напишете програма, която по дадено число N отпечатва случайно число
		// между 1 и N.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете едно число N за да отпечатате случайно число между 1 и N. (N>1)");
		
		double n = 0;
		while (n <= 1 ) {
		System.out.print("N = ");
		n = scanner.nextDouble();
		if (n <= 1) {
			System.out.println("Въведете число N > 1.");
		} else {
			continue;
		}
		}
		
		Random randomNumber = new Random();
		double myRandomNumber = 1 + randomNumber.nextDouble(n-1);
		System.out.printf("Вашето случайно число между 1 и %1$,.2f e %2$(,.2f", n, myRandomNumber);
		
	}

}
