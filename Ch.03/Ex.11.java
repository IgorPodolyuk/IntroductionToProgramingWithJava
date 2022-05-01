package exercises;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		// Дадено е число n и позиция p. Напишете поредица от операции, 
		// които да отпечатат стойността на бита на позиция p от числото n 
		// (0 или 1). 
		// Пример: n=35, p=5 -> 1. (?) 
		// Още един пример: n=35, p=6 -> 0. (?) 
		Scanner input = new Scanner(System.in);
		System.out.print("Input your number n = ");
		int number = input.nextInt();
		System.out.print("Input bit possition p = ");
		int position = input.nextInt();
		System.out.println("Числото " + number + " в двуична система е: " + Integer.toBinaryString(number));
		int shifted = number >> position-1;
		int check = 1 & shifted; // return value of bit No."position-1"
		System.out.println(check == 1 
				? position + " бит от дясно на ляво на числото " + number + " в двуична система е 1." 
				: position + " бит от дясно на ляво на числото " + number + " в двуична система е 0.");
		
	}
	
}
