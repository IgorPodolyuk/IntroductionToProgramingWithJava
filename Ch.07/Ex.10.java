package Lesson07_masivi_arrays_exercises;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Напишете програма, която създава следните квадратни матрици и 
				// ги извежда на конзолата във форматиран вид. Размерът на матриците 
				// се въвежда от конзолата. Пример за (4,4):
				
				Scanner input = new Scanner(System.in);
				System.out.println("Въведете броя на елементите на квадратната матрица \"N x N\" (N>0): ");
				int n = 0;
				while (n<1) {
					System.out.print("N = ");
					n = input.nextInt();
				}
				
				int[][] matrix1 = new int[n][n];
				int initial = 1;
				for (int i = 0 ; i < n; i++) {
					initial += i;
					for (int j = 0; j < n; j++) {
						matrix1[i][j] = initial;
						System.out.print(matrix1[i][j] + " ");
						initial += n;
					}
					System.out.println();
					initial = 1;
				}
				System.out.println();
				
				int[][] matrix2 = new int[n][n];
				for (int row = 0 ; row < n ; row ++) {
					initial += row;
					for (int col = 0; col < n ; col ++) {
						if (col % 2 == 0) {
							matrix2[row][col] = initial;
							initial += 2*n - 1 - 2*row;
							System.out.print(matrix2[row][col] + " ");
						} else if (col % 2 != 0) {
							matrix2[row][col] = initial;
							initial += 1 + 2*row;
							System.out.print(matrix2[row][col] + " ");
						}
					}
					initial = 1;
					System.out.println();
				}
				System.out.println();

	}

}
