package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;
import java.util.Arrays;

public class Ex04_10to2 {
	
	public static void main(String[] args) {
		
		// Да се напише програма, която преобразува десетично число в двоично.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input your number in decimal: x = ");
		int x = input.nextInt();
		
		if (x == 0) {
			System.out.println("x in binary = [0]");
		} else {
			int arrayElements = (int) (Math.log10(x)/Math.log10(2) + 1);
			int[] x0b = new int[arrayElements];
			for (int i=0; i<arrayElements; i++) {
				int y = x % 2;
				x0b[arrayElements-i-1] = y;
				x /= 2;
			}
			System.out.println("x in binary = " + Arrays.toString(x0b));
			System.out.println();
		}
		
	}
	
}
