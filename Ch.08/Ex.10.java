package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;

public class Ex10_2to10 {

	public static void main(String[] args) {
		// Да се напише програма, която преобразува двоично число в десетично 
		//по схемата на Хорнер.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Only numbers 0 and 1 are allowed.");
		System.out.print("Input your number in binary: x = ");
		char[] arrayChar = input.next().toCharArray();
		boolean binary = true;
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] != '0' && arrayChar[i] != '1') {
				System.out.println("Your number is not binary.");
				binary = false;
				break;
			}
		}
		
		if (binary == false) {
			System.out.println();
		} else {
			int[] arrayInt = new int[arrayChar.length];
			for (int i = 0; i < arrayInt.length; i++) {
				arrayInt[i] = Integer.parseInt("" + arrayChar[i]);
			}
			long numInDecimal = 0;
			for (int i = 0; i < arrayInt.length; i++) {
				numInDecimal = numInDecimal * 2 + arrayInt[i];
			}
			System.out.printf("Your number in decimal = %,d", numInDecimal);
		}

	}

}
