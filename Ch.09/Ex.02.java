package Lesson_09_Methods_exercises;

import java.util.Scanner;

public class Ex02_getMax {
	//Създайте метод getMax() с два целочислени (int) параметъра, 
	//който връща по-голямото от двете числа. Напишете програма, която прочита
	//три цели числа от конзолата и отпечатва най-голямото от тях, 
	//използвайки метода getMax().
	
	public static int getMax(int firstNumber, int secondNumber) {
		int maxNumber = Math.max(firstNumber, secondNumber);
		return maxNumber;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input your first number: ");
		int num1 = input.nextInt();
		System.out.print("Input your second number: ");
		int num2 = input.nextInt();
		System.out.print("Input your third number: ");
		int num3 = input.nextInt();
		int maxNumber = getMax(num1, num2);
		maxNumber = getMax(maxNumber, num3);
		System.out.println("The biggest number is " + maxNumber);
		input.close();		
	}

}
