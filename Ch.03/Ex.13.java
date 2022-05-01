package exercises;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// Напишете програма, която проверява дали дадено число n (n < 100) е просто.
		Scanner input = new Scanner(System.in);
		System.out.print("Input your number to check if it is prime or not: ");
		int number = input.nextInt();
		
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			 // condition for non prime number
			 if (number % i == 0) {
			   flag = true;
			   break;
			 }
		}

		if (!flag)
			 System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");
			  				
	}

}
