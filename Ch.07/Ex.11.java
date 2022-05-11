package Lesson07_masivi_arrays_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// Да се напише програма, която създава правоъгълна матрица с размер (n, m). 
		// Размерността и елементите на матрицата да се четат от конзолата. 
		// Да се намери подматрицата с размер (3,3), която има максимална сума.
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете броя на редовете на правоъгълна матрица \"n x m\" (n,m>0): ");
		int n = 0;
		while (n<3) {
			System.out.print("n = ");
			n = input.nextInt();
		}
		int m = 0;
		while (m<3) {
			System.out.print("m = ");
			m = input.nextInt();
		}
		int[][] matrix = new int[n][m];
		
		System.out.println("Въведете елементите на матрицата (цели числа):");
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < m ; j++) {
				System.out.print("Елемент [" + i + "][" + j + "] = ");
				matrix[i][j] = input.nextInt();
			}
		}
		
		// Find the maximal sum platform of size 3 x 3
		int bestSum = Integer.MIN_VALUE;
		int bestRow = 0;
		int bestCol = 0;
		for (int row = 0; row < matrix.length -2; row++) {
			for (int col = 0; col < matrix[row].length - 2; col++) {
				int sum = matrix[row][col]     + matrix[row][col + 1]     + matrix[row][col + 2] + 
						  matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
						  matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
				if (sum > bestSum) {
					bestSum = sum;
					bestRow = row;
					bestCol = col;
				}
			}
		}
		System.out.println();
		
		// Print the input matrix
		System.out.println("Вашата матрица е:");
		for ( int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < m ; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Print the result
		System.out.println("Подматрицата с размер (3,3), която има максимална сума е: ");
		System.out.printf(" [%d, %d, %d]%n",
				matrix[bestRow][bestCol],
				matrix[bestRow][bestCol+1],
				matrix[bestRow][bestCol+2]);
		System.out.printf(" [%d, %d, %d]%n",
				matrix[bestRow+1][bestCol],
				matrix[bestRow+1][bestCol+1],
				matrix[bestRow+1][bestCol+2]);
		System.out.printf(" [%d, %d, %d]%n",
				matrix[bestRow+2][bestCol],
				matrix[bestRow+2][bestCol+1],
				matrix[bestRow+2][bestCol+2]);
		System.out.printf("Максималната сума е: %d%n", bestSum);		

	}

}
