package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Напишете програма, която пресмята N!/K! за дадени N и K (1<K<N).
		Scanner scanner = new Scanner(System.in);
		System.out.println("Пресметнете N!/K! за дадени N и K (1<K<N)");
		
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
		
		long factorial = 1;
		for (int i = k+1; i <= n; i++) {
			factorial *= i;
		}
		System.out.printf("N!/K! = %,d", factorial);

	}

}
