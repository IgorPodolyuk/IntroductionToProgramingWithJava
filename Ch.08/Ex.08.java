package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;

public class Ex08_16to2 {

	public static void main(String[] args) {
		// Да се напише програма, която преобразува шестнадесетично число в двоично.
		
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
			String[] arrayString = new String[arrayChar.length];
			for (int i = 0; i < arrayChar.length; i++) {
				switch (arrayChar[i]) {
				case '0' : arrayString[i] = "0000"; break;
				case '1' : arrayString[i] = "0001"; break;
				case '2' : arrayString[i] = "0010"; break;
				case '3' : arrayString[i] = "0011"; break;
				case '4' : arrayString[i] = "0100"; break;
				case '5' : arrayString[i] = "0101"; break;
				case '6' : arrayString[i] = "0110"; break;
				case '7' : arrayString[i] = "0111"; break;
				case '8' : arrayString[i] = "1000"; break;
				case '9' : arrayString[i] = "1001"; break;
				case 'A' : arrayString[i] = "1010"; break;
				case 'B' : arrayString[i] = "1011"; break;
				case 'C' : arrayString[i] = "1100"; break;
				case 'D' : arrayString[i] = "1101"; break;
				case 'E' : arrayString[i] = "1110"; break;
				case 'F' : arrayString[i] = "1111"; break;
				}
			}
			System.out.printf("Your number in binary = ");
			for (int i = 0; i < arrayString.length; i++) {
				System.out.printf(arrayString[i] + " ");
			}
		}

	}

}
