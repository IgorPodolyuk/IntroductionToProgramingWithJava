package exercises;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		// Напишете израз, който да проверява дали третия бит 
		// на дадено число е 1 или 0
		Scanner input = new Scanner(System.in);
		System.out.print("Input your number: a = ");
		int a = input.nextInt() ;
		System.out.println("Числото " + a + " в двуична система е: " 
		+ Integer.toBinaryString(a));
		int c = 4; // c = 0b100
		int check = c & a;
		System.out.println(check == 4 
				? "Tретия бит от дясно на ляво на числото " + a + " в двуична система е 1." 
				: "Tретия бит от дясно на ляво на числото " + a + " в двуична система е 0.");
		
	}
	
}
