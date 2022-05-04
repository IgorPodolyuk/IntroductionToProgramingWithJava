package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		// Напишете програма, която отпечатва на конзолата числата от 1 до N.
		// Числото N се чете от стандартния вход.
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете едно цяло число N >= 1");
		
		int n = 0;
		while (n < 1) {
		System.out.print("N = ");
		n = input.nextInt();
		}
		
		int i = 1;
		while (i <= n) {
			System.out.printf("%d",i);
			if (i < n) {
				System.out.print(", ");
			} else {
				System.out.print(";");
			}
			i++;
		}
		
	}
	
}
