package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// Напишете програма, която преобразува дадено число от двоична в
		// десетична бройна система.
		Scanner input = new Scanner(System.in);
		System.out.print("Input your binary number: x = ");
		long x = input.nextLong();
		int arrayElements = (int) (Math.log10(x) + 1);
		long[] array = new long[arrayElements];
		
		for (int i=0; i<arrayElements; i++) {
			long y = x%10;
			if (y != 1 & y != 0) {
				System.out.println("Your number is not a binary!"); break;
			} else {
			array[arrayElements-i-1] = y;
			x /= 10;
			}
		}
		
		long sum = 0;
		for (int i = 0; i<array.length; i++) {
			long arrayNum = array[i] * (int) Math.pow(2, arrayElements-i-1);
			sum += arrayNum;
		}
		System.out.println("Your binary number in decimal = " + sum);

	}

}
