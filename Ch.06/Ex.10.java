package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Напишете програма, която чете от конзолата положително цяло число N
		// (N < 20) и отпечатва матрица с числа като на фигурата по-долу:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Отпечатване на матрица с N елемента. (20 >= N > 0)");
			
		int n = 0;
		while (n < 1 || n > 20) {
		System.out.print("N = ");
		n = scanner.nextInt();
		}
		
		for (int row = 1; row <= n; row++) {
			for (int col = row; col < row + n; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

}
