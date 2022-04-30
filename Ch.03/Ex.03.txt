package exercises;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		// Напишете израз, който да проверява дали дадено цяло число
		// съдържа 7 за трета цифра (отдясно на ляво)	
		Scanner input = new Scanner(System.in);
		System.out.print("Input your number: a = ");
		int a = input.nextInt();
		// System.out.println(a/100);
		// System.out.println((a/100) % 10);
		System.out.println((a/100) % 10 == 7 
				? ("Третата цифра (стотиците) на числото " + a + " е 7.")
				: ("Третата цифра (стотиците) на числото " + a + " не е 7."));
		
	}
	
}
