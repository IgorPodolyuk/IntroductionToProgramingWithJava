package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// Напишете програма, която пресмята на колко нули завършва факто-
		// риела на дадено число. Примери:
		// N = 10 -> N! = 3628800 -> 2
		// N = 20 -> N! = 2432902008176640000 -> 4
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Пресмята на колко нули завършва факториела на дадено цяло число N (N > 0)");
			
		int n = 0;
		while (n < 1) {
		System.out.print("N = ");
		n = scanner.nextInt();
		}
		
		double factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		
		int zeros = 0;
		for (int i = 1; factorial % 5 == 0; ) {
			zeros += i;
			factorial /= 5;
		}
		System.out.println("zero = " + zeros);

	}

}
