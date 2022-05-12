package Lesson07_masivi_arrays_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {
	// Напишете програма, която сортира целочислен масив по алгоритъма
	//"merge sort".

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете броя на вашите числа (number > 0): ");
		int number = 0;
		while (number<1) {
			System.out.print("N = ");
			number = input.nextInt();
		}
		int[] array = new int[number];
		System.out.println("Въведете елементите на масива.");
		for (int i=0 ; i<number ; i++) {
			System.out.print("Число No." + (i) + " = ");
			array[i] = input.nextInt();
		}
	    mergeSort(array, array.length);
	    System.out.println(Arrays.toString(array));
	}
	
	public static void mergeSort(int[] array, int numbers) {
	    if (numbers < 2) {
	        return;
	    }
	    int middle = numbers / 2;
	    int[] left = new int[middle];
	    int[] right = new int[numbers - middle];

	    for (int i = 0; i < middle; i++) {
	        left[i] = array[i];
	    }
	    for (int i = middle; i < numbers; i++) {
	        right[i - middle] = array[i];
	    }
	    mergeSort(left, middle);
	    mergeSort(right, numbers - middle);

	    merge(array, left, right, middle, numbers - middle);
	}

	public static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (leftArray[i] <= rightArray[j]) {
				array[k++] = leftArray[i++];
			} else {
				array[k++] = rightArray[j++];
			}
		}
		while (i < left) {
			array[k++] = leftArray[i++];
		}
		while (j < right) {
			array[k++] = rightArray[j++];
		}
	}

}
