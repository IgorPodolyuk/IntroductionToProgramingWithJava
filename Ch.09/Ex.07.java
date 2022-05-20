package Lesson_09_Methods_exercises;

import java.util.Scanner;

public class Ex07_OppositeNumber {
	//Напишете метод, който отпечатва цифрите на дадено десетично число в обратен ред. 
	//Например 256, трябва да бъде отпечатано като 652.
	
	public static boolean checkIfNumber(char[] arrayChar) {
		boolean ifNumber = true;
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] != '0' && arrayChar[i] != '1' && arrayChar[i] != '2' && arrayChar[i] != '3' && 
				arrayChar[i] != '4' && arrayChar[i] != '5' && arrayChar[i] != '6' && arrayChar[i] != '7' && 
				arrayChar[i] != '8' && arrayChar[i] != '9') {
				ifNumber = false;
				break;
			}
		}
		return ifNumber;
	}
	
	public static void printOppositeNumber(boolean ifNumber, char[] arrayChar) {
		if (ifNumber == false) {
			System.out.println("You did not input a number.");
		} else if (ifNumber == true){
			for (int i = arrayChar.length-1; i >=0 ; i--) {
				System.out.print(arrayChar[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Only numbers 0 to 9 are allowed.");
		System.out.print("Input your number: x = ");
		char[] arrayChar = input.next().toCharArray();
		
		//Check if input is a number
		boolean ifNumber = checkIfNumber(arrayChar);
		
		//Print oppositeNumber
		printOppositeNumber(ifNumber, arrayChar);
		
		input.close();
		
	}

}
