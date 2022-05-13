package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;

public class Ex06_10to16_ver2 {
	
	public static void main(String[] args) {
		
		// Да се напише програма, която преобразува десетично число
		// в шестнадесетично.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input your number in decimal: x = ");
		int x = input.nextInt();
		
		if (x == 0) {
			System.out.println("x in hexadecimal = 0");
		} else {
			int arrayElements = (int) (Math.log10(x)/Math.log10(16) + 1);
			int[] x0x = new int[arrayElements];
			System.out.print("x in hexadecimal = ");
			
			for (int i=0; i<arrayElements; i++) {
				int y = x % 16;
				x0x[arrayElements-i-1] = y;
				x /= 16;
			}
			
			for (int i=0; i<arrayElements; i++)
				switch (x0x[i]) {
				case 10 : System.out.print("A"); break;
				case 11 : System.out.print("B"); break;
				case 12 : System.out.print("C"); break;
				case 13 : System.out.print("D"); break;
				case 14 : System.out.print("E"); break;
				case 15 : System.out.print("F"); break;
				default: System.out.print(x0x[i]); break;
				}
		}
		
	}
	
}
