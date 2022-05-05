package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// В комбинаториката числата на Каталан (Catalan's numbers) се
		// изчисляват по следната формула: Cn = (2n)!/((n+1)!*n!), за n >= 0.
		// Напишете програма, която изчислява N-тото число на Каталан за дадено N.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Пресметнете Cn = (2n)!/((n+1)!*n!), за n >= 0, n - цяло число)");
		
		double n = -1;
		while (n < 0 || n % 1 != 0) {
		System.out.print("n = ");
		n = scanner.nextDouble();
		}
		
		// Cn = (2n)!/((n+1)!*n!) = (2n)!/(n+1)!/n!
		// 1) (2n)!/(n+1)! = ((n+1)+1)*...*(2n) = (n+2)*...*(2n)= firstPart
		// 2) (2n)!/(n+1)!/n! = firstPart/n!
		double first = n+2;
		double last = 2*n;
		double firstPart = 1;
		for (double i = first; i <= last; i++ ) {
			firstPart *= i;
		}
		
		double nFactorial = 1;
		for (int i = 1; i <= n; i++) {
			nFactorial *= i;
		}
		
		double cn = firstPart/nFactorial;
		System.out.printf("Cn = %,.0f", cn);
		
	}

}
