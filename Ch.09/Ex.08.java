package Lesson_09_Methods_exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex08_nFactorialEachN {
	
	//Напишете програма, която пресмята и отпечатва n! за всяко n в интервала [1..100].
	
		public static void nFactorialEachN(int n) {
			for (int i = 1; i <= n; i++) {
				BigInteger factorial = BigInteger.ONE;
				for (int j = 1; j <= i; j++) {
					BigInteger iBig = BigInteger.valueOf(j);
					factorial = factorial.multiply(iBig);
				}
				System.out.printf("%1$d! = %2$,d%n", i, factorial);
			}
		}

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int n = 0;
			while (n < 1 || n > 100) {
				System.out.println("Input a number in intevral [1...100]");
				System.out.print("n = ");
				n = input.nextInt();
			}
			
			nFactorialEachN(n);
			
			input.close();
			
		}

}
