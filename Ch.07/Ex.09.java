package Lesson07_masivi_arrays_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// Да се напише програма, която намира последователност от числа в масив,
		// които имат сума равна на число, въведено от конзолата (ако има такава).
		// Пример: {4, 3, 1, 4, 2, 5, 8}, S=11 -> {4, 2, 5}.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете броя на елементите на масива (N>0): ");
		int n = 0;
		while (n<1) {
			System.out.print("N = ");
			n = input.nextInt();
		}
		int[] array = new int[n];
		System.out.println("Въведете елементите на масива.");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Масив, елемент No." + (i+1) + " = ");
			array[i] = input.nextInt();
		}
		System.out.println("Вашият масив е: " + Arrays.toString(array));
		
		System.out.print("Въведете вашето желано число S = ");
		int s = input.nextInt();
		
		int sum = 0;
		for (int i = 0 ; i < array.length ; i++) {
			for (int j = i ; j < array.length ; j++) {
				sum += array[j];
				if (sum < s) {
					continue;
				} else if (sum > s) {
					sum = 0;
					break;
				} else if (sum == s) {
					System.out.println("Последователността от числа в масива, които имат сума равна на S = " + s + " e:");
					for (int v = i ; v <= j ; v++) {
						System.out.print(array[v] + "; ");
					}
					break;
				}
			}
			if (sum == s) {
				break;
			}
		}
		if (sum != s) {
			System.out.println("Няма подходяща последователност от числа.");
		}

	}

}
