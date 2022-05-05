package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// Напишете програма, която за дадено цяло число N, пресмята сумата:
		// S = 1 + 1!/x + 2!/x^2 + n!/x^n  // x = ?
		Scanner scanner = new Scanner(System.in);
		System.out.println("Пресметнете S = 1 + 1!/x + 2!/x^2 + n!/x^n за дадени n и x (n & x >= 1)");
		
		double n = 0;
		while (n < 1) {
		System.out.print("n = ");
		n = scanner.nextDouble();
		}
		
		double x = 0;
		while (x < 1 || x % 1 != 0) {
		System.out.print("x (integer) = ");
		x = scanner.nextDouble();
		}
		
		double[] denominators = new double[(int) n];
		for (int i = 0; i < n; i++) {
			denominators[i] = (long) Math.pow(x, i+1);
		}
		
		double[] numerators = new double[(int) n];
		for (int m = 0; m < n; m++) {
			double factorial = 1;
			for (int i = 0; i <= m; i++) {
				factorial *= i+1;
				numerators[m] = factorial;
			}
		}
		
		double[] numbers = new double[(int) n];
		for (int i = 0; i < n; i++ ) {
			numbers[i] = numerators[i]/denominators[i];
		}
		
		double sum = 1;
		System.out.print("sum = 1");
		for (int i = 0; i < n; i++) {
			sum += numbers[i];
			if (i<n-1) {
				System.out.print(" + " + numbers[i]);
			} else {
				System.out.println(" + " + numbers[i] + ";");
			}
		}
		System.out.println("sum = " + sum);
	
	}

}
