package Lesson_08_Broini_Sistemi_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12_ArabicToRomanNumbers {

	public static void main(String[] args) {
		// Да се напише програма, която преобразува арабските числа в римски
		
		Scanner input = new Scanner(System.in);
		System.out.println("Roman numbers: I=1, V=5, X=10, L=50, C=100, D=500, M=1000;");
		System.out.println("Arabic numbers: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9;");
		int x = 0;
		while (x < 1 || x > 3999) {
			System.out.print("Input your number in arabic numbers (between 1 and 3999): x = ");
			x = input.nextInt();
		}
		int thousands = x / 1000;
		int hundreds = (x % 1000) / 100;
		int tenth = ((x % 1000) % 100) / 10;
		int units = (((x % 1000) % 100) % 10);
		
		String[] romanNumbersArray = new String[4];
		
		switch (thousands) {
		case 0 : romanNumbersArray[0] = ""; break;
		case 1 : romanNumbersArray[0] = "M"; break;
		case 2 : romanNumbersArray[0] = "MM"; break;
		case 3 : romanNumbersArray[0] = "MMM"; break;
		}
		
		switch (hundreds) {
		case 0 : romanNumbersArray[1] = ""; break;
		case 1 : romanNumbersArray[1] = "C"; break;
		case 2 : romanNumbersArray[1] = "CC"; break;
		case 3 : romanNumbersArray[1] = "CCC"; break;
		case 4 : romanNumbersArray[1] = "CD"; break;
		case 5 : romanNumbersArray[1] = "D"; break;
		case 6 : romanNumbersArray[1] = "DC"; break;
		case 7 : romanNumbersArray[1] = "DCC"; break;
		case 8 : romanNumbersArray[1] = "DCCC"; break;
		case 9 : romanNumbersArray[1] = "CM"; break;
		}
		
		switch (tenth) {
		case 0 : romanNumbersArray[2] = ""; break;
		case 1 : romanNumbersArray[2] = "X"; break;
		case 2 : romanNumbersArray[2] = "XX"; break;
		case 3 : romanNumbersArray[2] = "XXX"; break;
		case 4 : romanNumbersArray[2] = "XL"; break;
		case 5 : romanNumbersArray[2] = "L"; break;
		case 6 : romanNumbersArray[2] = "LX"; break;
		case 7 : romanNumbersArray[2] = "LXX"; break;
		case 8 : romanNumbersArray[2] = "LXXX"; break;
		case 9 : romanNumbersArray[2] = "XC"; break;
		}
		
		switch (units) {
		case 0 : romanNumbersArray[3] = ""; break;
		case 1 : romanNumbersArray[3] = "I"; break;
		case 2 : romanNumbersArray[3] = "II"; break;
		case 3 : romanNumbersArray[3] = "III"; break;
		case 4 : romanNumbersArray[3] = "IV"; break;
		case 5 : romanNumbersArray[3] = "V"; break;
		case 6 : romanNumbersArray[3] = "VI"; break;
		case 7 : romanNumbersArray[3] = "VII"; break;
		case 8 : romanNumbersArray[3] = "VIII"; break;
		case 9 : romanNumbersArray[3] = "IX"; break;
		}
		
		System.out.print("Your number is = ");
		for (int i = 0; i < 4; i++) {
			System.out.print(romanNumbersArray[i]);
		}

	}

}
