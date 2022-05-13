package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;

public class Ex05_2to10 {
	
	public static void main(String[] args) {
	
		// Да се напише програма, която преобразува двоично число в десетично.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input your binary number: x = ");
		long x = input.nextLong();
		if (x == 0) {
			System.out.println("Your binary number in decimal = 0");
			return;
		}
		int arrayElements = (int) (Math.log10(x) + 1);
		long[] array = new long[arrayElements];
		
		long y = 2;
		for (int i = 0; i < arrayElements; i++) {
			y = x % 10;
			if (y != 1 & y != 0) {
				System.out.println("Your number is not a binary!"); break;
			} else {
			array[arrayElements-i-1] = y;
			x /= 10;
			}
		}

		long sum = 0;
		for (int i = 0; i < array.length; i++) {
			long arrayNum = array[i] * (int) Math.pow(2, arrayElements-i-1);
			sum += arrayNum;
		}
		if (y != 1 & y != 0) {
			System.out.println();
		} else {
			System.out.println("Your binary number in decimal = " + sum);
		}
		
	}
	
}
