package Lesson_09_Methods_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06_ReturnBiggerNumberInArray {
	//Напишете метод, който връща позицията на първия елемент на масив, който е по-голям 
	//от двата свои съседи едновременно, или -1, ако няма такъв елемент.
	
	public static int findBiggerNumberCompareToAjdacent(int[] array) {
		int index = 0;
		for (int i = 1; i <= array.length-2; i++) {
			if (array[i] > array[i+1] && array[i] > array[i-1]) {
				index = i;
				break;
			}
		}	
		return index;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers you want to input in your array?");
		int numbersInArray = 0;
		while (numbersInArray < 3) {
			System.out.println("Insert number 3 or higher.");
			System.out.print("n = ");
			numbersInArray = input.nextInt();
		}
		int[] array = new int[numbersInArray];
		System.out.println("Insert your numbers.");
		for (int i=0; i < numbersInArray; i++) {
			System.out.print("No." + (i+1) + ": ");
			array[i] = input.nextInt();
		}
		
		System.out.println("Your array: " + Arrays.toString(array));
		int firstBiggerNumberIndex = findBiggerNumberCompareToAjdacent(array);
		if (firstBiggerNumberIndex == 0) {
			System.out.println("Няма елемент, който да е по-голям oт двата свои съседи едновременно."); 
		} else {
			System.out.printf("Позицията на първия елемент на масив, %n"
					+ "който е по-голям oт двата свои съседи едновременно e:%n"
					+ "Позиция No.%d%n"
					+ "Стойност \"%d\"%n", firstBiggerNumberIndex+1, array[firstBiggerNumberIndex]);
			System.out.println(array[firstBiggerNumberIndex] + " > " + array[firstBiggerNumberIndex-1]);
			System.out.println(array[firstBiggerNumberIndex] + " > " + array[firstBiggerNumberIndex+1]);
		}
		input.close();
		
	}

}
