package Lesson_09_Methods_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_CampareNumber {
	//Напишете метод, който проверява дали елемент, намиращ се на дадена позиция от масив, 
	//е по-голям, или съответно по-малък от двата му съседа.

	public static void compareNumberWithTheUpperNumber(int[] array, int index) {
		if (array[index] > array[index+1]) {
			System.out.println(array[index] + " > " + array[index+1]);
		} else if (array[index] == array[index+1]) {
			System.out.println(array[index] +" = " + array[index+1]);
		} else {
			System.out.println(array[index] +" < " + array[index+1]);
		}
	}
	
	public static void compareNumberWithTheLowerNumber(int[] array, int index) {
		if (array[index] > array[index-1]) {
			System.out.println(array[index] + " > " + array[index-1]);
		} else if (array[index] == array[index-1]) {
			System.out.println(array[index] +" = " + array[index-1]);
		} else {
			System.out.println(array[index] +" < " + array[index-1]);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers you want to input in your array?");
		System.out.print("n = ");
		int numbersInArray = input.nextInt();
		int[] array = new int[numbersInArray];
		System.out.println("Insert your numbers.");
		for (int i=0; i < numbersInArray; i++) {
			System.out.print("No." + (i+1) + ": ");
			array[i] = input.nextInt();
		}
		int[] indexArray = new int[numbersInArray];
		for (int i = 0; i < numbersInArray; i++) {
			indexArray[i] = i;
		}
				
		System.out.println("Your array: " + Arrays.toString(array));
		System.out.println("Indexes No: " + Arrays.toString(indexArray));
		System.out.print("Insert the index of your number to compare: ");
		int index = input.nextInt();
		
		if (index == 0) {
			compareNumberWithTheUpperNumber(array, index);
		} else if (index == numbersInArray-1) {
			compareNumberWithTheLowerNumber(array, index);
		} else if (index > 0 && index < numbersInArray-1) {
			compareNumberWithTheUpperNumber(array, index);
			compareNumberWithTheLowerNumber(array, index);
		} else {
			System.out.println("Your index if out of the array.");
		}
		
		input.close();
		
	}

}
