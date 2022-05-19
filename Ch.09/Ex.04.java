package Lesson_09_Methods_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_NumberInArray {
	//Напишете метод, който намира колко пъти дадено число се среща в даден масив.
	//Напишете програма, която проверява дали този метод работи правилно.
	
	public static int findHowManyTimesNumberInArray(int[] array, int yourNumber) {
		int counter = 0;
		for (int i=0; i<array.length; i++) {
			if (yourNumber == array[i]) {
				counter++;
			}
		}
		return counter;
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
		
		System.out.print("Insert your number for search: ");
		int n = input.nextInt();
		
		int counter = findHowManyTimesNumberInArray(array, n);
		System.out.println("The number \"" + n + "\" was met \"" + counter + "\" times in your array: "
							+ Arrays.toString(array));
		input.close();

	}

}
