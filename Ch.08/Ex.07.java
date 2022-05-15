package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;

public class Ex07_16to10 {

	public static void main(String[] args) {
		// Да се напише програма, която преобразува 
		// шестнадесетично число в десетично.
		
		Scanner input = new Scanner(System.in);
		System.out.println("A=10, B=11, C=12, D=13, E=14, F=15;");
		System.out.print("Input your number in hexadecimal: x = ");
		char[] arrayChar = input.next().toUpperCase().toCharArray();
		boolean hexadecimal = true;
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] != '0' && arrayChar[i] != '1' && arrayChar[i] != '2' && arrayChar[i] != '3' && 
				arrayChar[i] != '4' && arrayChar[i] != '5' && arrayChar[i] != '6' && arrayChar[i] != '7' && 
				arrayChar[i] != '8' && arrayChar[i] != '9' && arrayChar[i] != 'A' && arrayChar[i] != 'B' && 
				arrayChar[i] != 'C' && arrayChar[i] != 'D' && arrayChar[i] != 'E' && arrayChar[i] != 'F') {
				System.out.println("Your number is not hexadecimal.");
				hexadecimal = false;
				break;
			}
		}
		if (hexadecimal == false) {
			System.out.println();
		} else {
			int[] arrayInt = new int[arrayChar.length];
			for (int i = 0; i < arrayChar.length; i++) {
				switch (arrayChar[i]) {
				case '0' : arrayInt[i] = 0; break;
				case '1' : arrayInt[i] = 1; break;
				case '2' : arrayInt[i] = 2; break;
				case '3' : arrayInt[i] = 3; break;
				case '4' : arrayInt[i] = 4; break;
				case '5' : arrayInt[i] = 5; break;
				case '6' : arrayInt[i] = 6; break;
				case '7' : arrayInt[i] = 7; break;
				case '8' : arrayInt[i] = 8; break;
				case '9' : arrayInt[i] = 9; break;
				case 'A' : arrayInt[i] = 10; break;
				case 'B' : arrayInt[i] = 11; break;
				case 'C' : arrayInt[i] = 12; break;
				case 'D' : arrayInt[i] = 13; break;
				case 'E' : arrayInt[i] = 14; break;
				case 'F' : arrayInt[i] = 15; break;
				}
			}
			long sum = 0;
			for (int i = arrayInt.length-1; i >= 0; i--) {
				sum += (arrayInt[i] * (long) Math.pow(16, arrayChar.length-i-1));
			}
			System.out.printf("Your number in decimal = %,d", sum);
		}
		
	}

}
