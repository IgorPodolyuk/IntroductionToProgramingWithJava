package Lesson07_masivi_arrays_exercises;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Напишете програма, която намира максималната редица от нарастващи 
		// елементи в масив. Пример: {3, 2, 3, 4, 2, 2, 4} -> {2, 3, 4}.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Въведете символите масива (без разстояние между тях): ");
		char[] array = input.next().toCharArray();
		
		int startIndex = 0;
		int counter = 1;
		int bestStartIndex = 0;
		int bestLength = 0;
		
		for (int i = 0 ; i<array.length ; i++) {
			if (i == 0 || array[i] <= array[i-1]) {
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
		
		System.out.println("Максималната първа редица от нарастващи елементи в масива е:");
		for (int i = bestStartIndex ; i < (bestStartIndex + bestLength) ; i++) {
			System.out.print(array[i]);
		}

	}

}
