package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;

public class Ex04_10to2_ver2 {
	
	public static void main(String[] args) {
		
	// Да се напише програма, която преобразува десетично число в двоично.
	
		Scanner input = new Scanner(System.in);
		System.out.print("Input your number in decimal: x = ");
		int x = input.nextInt();
	
		if (x == 0) {
			System.out.println("x in binary = 0");
		} else {
			int arrayElements = (int) (Math.log10(x)/Math.log10(2) + 1);
			int[] x0b = new int[arrayElements];
			System.out.print("x in binary = ");
		
			for (int i = 0 ; i < arrayElements ; i++) {
				int y = x % 2;
				x0b[arrayElements-i-1] = y;
				x /= 2;
			}

			for (int i = 0 ; i < arrayElements ; i++) {
				System.out.print(x0b[i]);
			}
		}
	
	}
	
}
