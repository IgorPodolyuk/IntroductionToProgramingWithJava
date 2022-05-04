package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		// Напишете програма, която отпечатва на конзолата числата от 1 до N,
		// които не се делят на 3 и 7. Числото N се чете от стандартния вход.
		Scanner input = new Scanner(System.in);
		System.out.print("N = ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			if ((i % 3 == 0) | (i % 7 == 0)) {
				continue;
			}
			System.out.printf("%d",i);
			if (i < n) {
				System.out.print(", ");
			} else {
				System.out.print(";");
			}
			
		}
		
	}
	
}
