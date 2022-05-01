package Lesson05_exercises;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Напишете програма, която за дадена цифра (0-9), зададена като вход,
		// извежда името на цифрата на български език.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Въведете една цифра от 0 до 9: ");
		System.out.print("x = ");
		
		byte x = input.nextByte();
		switch (x) {
		case 0: System.out.println("\"x\" e нула"); break;
		case 1: System.out.println("\"x\" e едно"); break;
		case 2: System.out.println("\"x\" e две"); break;
		case 3: System.out.println("\"x\" e три"); break;
		case 4: System.out.println("\"x\" e четири"); break;
		case 5: System.out.println("\"x\" e пет"); break;
		case 6: System.out.println("\"x\" e шест"); break;
		case 7: System.out.println("\"x\" e седем"); break;
		case 8: System.out.println("\"x\" e осем"); break;
		case 9: System.out.println("\"x\" e девет"); break;
		default: System.out.println("\"x\" не е цяло число от 0 до 9");
		}
		
	}
	
}
