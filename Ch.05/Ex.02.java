package Lesson05_exercises;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		// Напишете програма, която показва знака (+ или -) 
		// от частното на две реални числа, без да го пресмята.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Въведете две числа: ");
		System.out.print("Числител: a = ");
		double a = input.nextDouble();
		System.out.print("Знаменател: b = ");
		double b = input.nextDouble();
		
		if (b==0) {
			System.out.println("Не се дели на 0.");
		} else if (a==0) {
			System.out.println("Частното на а и b = 0.");
		} else if (((a>0)&(b>0))|((a<0)&(b<0))) {
			System.out.printf("Частното на а и b е положително (+) = %+.3f", a/b);
		} else {
			System.out.printf("Частното на а и b е отрицателно (-) = %+.3f", a/b);
		}
		
	}
	
}
