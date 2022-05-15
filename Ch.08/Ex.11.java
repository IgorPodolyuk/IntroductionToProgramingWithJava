package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;

public class Ex11_RomanToArabicNumbers {

	public static void main(String[] args) {
		// Да се напише програма, която преобразува римските числа в арабски.
		
		Scanner input = new Scanner(System.in);
		System.out.println("I=1, V=5, X=10, L=50, C=100, D=500, M=1000;");
		System.out.print("Input your number in roman numbers: x = ");
		char[] arrayChar = input.next().toUpperCase().toCharArray();
		boolean romanNummbers = true;
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] != 'I' && arrayChar[i] != 'V' && arrayChar[i] != 'X' &&
				arrayChar[i] != 'L' && arrayChar[i] != 'C' && arrayChar[i] != 'D' && 
				arrayChar[i] != 'M') {
				System.out.println("Your number is not in roman numbers.");
				romanNummbers = false;
				break;
			}
		}
		
		if (romanNummbers == false) {
			System.out.println();
		} else {
			int[] arrayArabic = new int[arrayChar.length];
			for (short i = 0; i < arrayChar.length; i++) {
				switch (arrayChar[i]) {
				case 'I' : arrayArabic[i] = 1; break;
				case 'V' : arrayArabic[i] = 5; break;
				case 'X' : arrayArabic[i] = 10; break;
				case 'L' : arrayArabic[i] = 50; break;
				case 'C' : arrayArabic[i] = 100; break;
				case 'D' : arrayArabic[i] = 500; break;
				case 'M' : arrayArabic[i] = 1000; break;
				}
			}
			
			for ( short i = 0; i < arrayArabic.length-1; i++) {
				if (arrayArabic[i] >= arrayArabic[i+1]) {
					arrayArabic[i] = arrayArabic[i];
				} else {
					arrayArabic[i] = -arrayArabic[i];
				}
			}
			
			long sum = 0;
			for (short i = 0; i < arrayArabic.length; i++) {
				sum += arrayArabic[i];
			}
			System.out.println("Your number in decimal = " + sum);
		}

	}

}
