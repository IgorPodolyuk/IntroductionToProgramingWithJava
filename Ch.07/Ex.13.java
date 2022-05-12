package Lesson07_masivi_arrays_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете броя на вашите числа (n > 0): ");
		int n = 0;
		while (n<1) {
			System.out.print("N = ");
			n = input.nextInt();
		}
		int[] array = new int[n];
		System.out.println("Въведете елементите на масива.");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Число No." + (i) + " = ");
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Вашият подреден масив е: " + Arrays.toString(array));
		System.out.println();
		System.out.println("Въведете числото, на което искате да проверите индекса:");
		int x = 0;
		while (x != Integer.MIN_VALUE) {
			System.out.print("x = ");
			x = input.nextInt();
			System.out.println("Индексът на " + x + " е: " + Arrays.binarySearch(array, x));
		}

	}

}
