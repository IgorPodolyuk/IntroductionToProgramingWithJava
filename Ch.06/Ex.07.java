package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// Напишете програма, която пресмята N!*K!/(N-K)! за дадени N и K.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Пресметнете N!*K!/(N-K)! за дадени N и K (N>K>1)");
		
		int n = 0;
		while (n < 1) {
		System.out.print("N = ");
		n = scanner.nextInt();
		}
		
		int k = 0;
		while (k < 1 || k > n) {
		System.out.print("K = ");
		k = scanner.nextInt();
		}
		
		int y = n - k;
		// N!*K!/(N-K)! = (N!/(N-K)!)*K! = (N!/Y!)*K!
		long factorialNY = 1;
		for (int i = y + 1; i <= n; i++) {
			factorialNY *= i;
		}
		
		long factorialK = 1;
		for (int i = 1; i <= k; i++) {
			factorialK *= i;
		}

		long factorial = factorialNY*factorialK;
		System.out.printf("N!*K!/(N-K)! = %,d%n", factorial);
		
	}

}
