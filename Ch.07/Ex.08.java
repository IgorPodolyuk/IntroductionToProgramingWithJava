package Lesson07_masivi_arrays_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// Напишете програма, която намира най-често срещания елемент в масив. 
		// Пример: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} -> 4 (5 пъти).
		
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
		Arrays.sort(array);
		int startIndex = 0;
		int counter = 1;
		int bestStartIndex = 0;
		int bestLength = 0;
		for (int i = 0 ; i<array.length ; i++) {
			if (i == 0 || array[i] != array[i-1]) {
				counter = 1;
				startIndex = i;
			} else {
				counter += 1;
			}
			if (counter > bestLength) {
				bestLength = counter;
				bestStartIndex = startIndex;
			}
		}
		System.out.println("Първото най-често срещано число в масива е " + array[bestStartIndex] + " и се среща " + bestLength + " пъти.");

	}

}
