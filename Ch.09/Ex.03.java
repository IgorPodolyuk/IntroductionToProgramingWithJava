package Lesson_09_Methods_exercises;

import java.util.Scanner;

public class Ex03_lastNumberName {
	// Напишете метод, който връща английското наименование на последната цифра от 
	//дадено число. Примери: за числото 512 отпечатва "two"; за числото 1024 – "four".
	
	public static String printLastNumberName(int number) {
		
		String lastNumberName = "";
		switch (number) {
		case 0: lastNumberName = "zero"; break;
		case 1: lastNumberName = "one"; break;
		case 2: lastNumberName = "two"; break;
		case 3: lastNumberName = "three"; break;
		case 4: lastNumberName = "four"; break;
		case 5: lastNumberName = "five"; break;
		case 6: lastNumberName = "six"; break;
		case 7: lastNumberName = "seven"; break;
		case 8: lastNumberName = "eight"; break;
		case 9: lastNumberName = "nine"; break;
		}
		
		return lastNumberName;
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Type your number: ");
		int number = input.nextInt();
		
		int lastDigit = number % 10;
		
		System.out.println("Your number ends at " + printLastNumberName(lastDigit) + ".");
		input.close();
		
	}

}
