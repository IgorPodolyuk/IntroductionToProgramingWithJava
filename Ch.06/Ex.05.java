package Lesson06_Cikli_exercises;
import java.util.Scanner;
public class Ex05v1 {
	public static void main(String[] args) {
		// Напишете програма, която чете от конзолата числото N и отпечатва
		// сумата на първите N члена от редицата на Фибоначи: 0, 1, 1, 2, 3, 5, 8,
		// 13, 21, 34, 55, 89, 144, 233, 377, ...
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете броя (N) на членовете от "
				+ "редицата на Фибоначи, които искате да сумирате.");
		System.out.print("N = ");
		int n = input.nextInt();
	
		System.out.print("Fibonacci Numbers = ");
		long firstFibonacciNumber = 0;
		long secondFibonacciNumber = 1;
		long numbers[] = new long[n];
		if (n == 0) {
			System.out.println("There are no any Fibonacci Number!");;
		} else if (n == 1) {
			numbers[0] = firstFibonacciNumber;
			System.out.println(java.util.Arrays.toString(numbers));
		} else if (n == 2) {
			numbers[0] = firstFibonacciNumber;
			numbers[1] = secondFibonacciNumber;
			System.out.println(java.util.Arrays.toString(numbers));
		} else {
			numbers[0] = firstFibonacciNumber;
			numbers[1] = secondFibonacciNumber;
			for ( int i = 2; i <= n-1; i++) {
				numbers[i] = numbers[i-1] + numbers[i-2];
			}
			System.out.println(java.util.Arrays.toString(numbers));
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum of Fibonacci Numbers = " + sum);

	}
	
}
