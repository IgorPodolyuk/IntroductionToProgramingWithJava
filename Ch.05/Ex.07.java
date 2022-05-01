package Lesson05_exercises;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// Дадени са няколко цели числа. 
		// Напишете програма, която намира онези
		// подмножества от тях, които имат сума 0. Примери:
		// - Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
		// - Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете три числа различни от 0: {a, b, c}");
		System.out.print("a = ");
		double a = input.nextDouble();
		System.out.print("b = ");
		double b = input.nextDouble();
		System.out.print("c = ");
		double c = input.nextDouble();
		
		if ((a+b==0)&(a+c==0)) {
			System.out.println("Сумата на a = " + a + " и b = " + b + " е " + (a+b));
			System.out.println("Сумата на a = " + a + " и c = " + c + " е " + (a+c));
		} else if ((a+b==0)&(b+c==0)) {
			System.out.println("Сумата на a = " + a + " и b = " + b + " е " + (a+b));
			System.out.println("Сумата на b = " + b + " и c = " + c + " е " + (b+c));
		} else if ((a+c==0)&(b+c==0)) {
			System.out.println("Сумата на a = " + a + " и c = " + c + " е " + (a+c));
			System.out.println("Сумата на b = " + b + " и c = " + c + " е " + (b+c));
		} else if ((a+b)==0) {
			System.out.println("Сумата на a = " + a + " и b = " + b + " е " + (a+b));
		} else if ((a+c)==0) {
			System.out.println("Сумата на a = " + a + " и c = " + c + " е " + (a+c));
		} else if ((b+c)==0) {
			System.out.println("Сумата на b = " + b + " и c = " + c + " е " + (b+c));
		} else {
			System.out.println("Няма подмножества със сума 0.");
		}
		
	}
	
}
