package Lesson07_masivi_arrays_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Да се напише програма, която чете от конзолата две цели числа N и K,
		// и масив от N елемента. Да се намерят тези K елемента, които имат
		// максимална сума
		
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете броя на елементите на масива N. (N>0)");
		int n = 0;
		while (n<1) {
			System.out.print("N = ");
			n = input.nextInt();
		}
		int[] arrayN = new int[n];
		
		System.out.println("Въведете броя на елементите \"K\" за намиране на максималната сума. (K<=N)");
		int k = 0;
		while (k > n || k < 1) {
		System.out.print("K = ");
		k = input.nextInt();
		}
		int[] arrayK = new int[k];
		
		System.out.println("Въведете елементите на масива N.");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Масив N., елемент No." + (i+1) + " = ");
			arrayN[i] = input.nextInt();
		}
		
		int bestSum = 0;
		int bestStartIndex = 0;
		
		for (int i=0 ; i<=n-k ; i++) {
			int sum = 0;
			for (int j=0 ; j<k ; j++) {
				arrayK[j] = arrayN[i+j];
				sum += arrayK[j];
				}
				if (bestSum < sum) {
					bestSum = sum;
					bestStartIndex = i;
			}
		}
		
		int[] bestArray = new int[k];
		for (int i=0 ; i<k ; i++) {
			bestArray[i] = arrayN[bestStartIndex+i];
		}
		System.out.println("Вашите числа са: " + Arrays.toString(arrayN));
		System.out.println("K елементите с максимална сума са: " + Arrays.toString(bestArray));
		System.out.println("Максималната сума е: " + bestSum);
		System.out.println("Започва от елемент No." + (bestStartIndex+1));
		
	}

}
