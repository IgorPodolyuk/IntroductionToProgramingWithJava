package Lesson05_exercises;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		// Напишете програма, която при въвеждане на коефициентите (a, b и c)
		// на квадратно уравнение: ax^2 + bx + c , изчислява и извежда неговите
		// реални корени.
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Намиране на корените x1 и x2 на квадратно уравнение: "
				+ "аx^2 + bx + c = 0");
		System.out.println("Въведете следните стойности: ");
		System.out.print("a = ");
		double a = input.nextDouble();
		System.out.print("b = ");
		double b = input.nextDouble();
		System.out.print("c = ");
		double c = input.nextDouble();
		
		// Намираме стойността на "Дискриминантата" (D)
		
		if ((b*b - 4*a*c) < 0) {
			System.out.println("Дискриминантата е отрицателно число, "
					+ "затова квадратното уравнение няма реални корени.");
		} else {
			double D = Math.sqrt(b*b - 4*a*c);
			System.out.printf("\"Дискриминантата\" D = %.4f%n", D);
			
			if (D == 0) {
				System.out.printf("Квадратното уравнение има "
						+ "един двоен реален корен x1,2 = %.4f%n", ((-b)/(2*a)));
			} else {
				System.out.println("Квадратното уравнението има "
						+ "два различни реални корени x1, x2: ");
				System.out.printf("x1 = %.4f%n", (-b+D)/(2*a));
				System.out.printf("x2 = %.4f%n", (-b-D)/(2*a));
			}
		}
				
	}
	
}
