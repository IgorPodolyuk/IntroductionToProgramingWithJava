package Lesson_09_Methods_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09_Program3in1 {
	//Напишете програма, която решава следните задачи:
	//- Обръща последователността на цифрите на едно число.
	//- Пресмята средното аритметично на дадена редица.
	//- Решава линейното уравнение a * x + b = 0.
	//Създайте подходящи методи за всяка една от задачите.
	//Напишете програмата така, че на потребителя да му бъде изведено текстово меню,
	//от което да избира коя задача да решава.
	//Направете проверка на входните данни:
	//- Десетичното число трябва да е неотрицателно.
	//- Редицата не трябва да е празна.
	//- Коефициентът a не трябва да е 0.
	
	public static void reverseNumber() {
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Only numbers 0 to 9 are allowed.");
		System.out.print("Input your number: x = ");
		char[] arrayChar = input.next().toCharArray();
		
		//Check if input is a number
		boolean ifNumber = checkIfNumber(arrayChar);
		
		//Print reverse number
		printReverseNumber(ifNumber, arrayChar);
		input.close();
	}
	
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
	
	public static void printReverseNumber(boolean ifNumber, char[] arrayChar) {
		if (ifNumber == false) {
			System.out.println("You did not input a positive number.");
		} else if (ifNumber == true){
			for (int i = arrayChar.length-1; i >=0 ; i--) {
				System.out.print(arrayChar[i]);
			}
		}
	}
	
	public static void arithmeticMeanOfSeries() {
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers you want to input in your series?");
		int numbersInArray = 0;
		while (numbersInArray < 1) {
			System.out.println("Insert number 1 or higher.");
			System.out.print("n = ");
			numbersInArray = input.nextInt();
		}
		int[] arraySeries = new int[numbersInArray];
		System.out.println("Insert your numbers.");
		for (int i=0; i < numbersInArray; i++) {
			System.out.print("No." + (i+1) + ": ");
			arraySeries[i] = input.nextInt();
		}

		double sum = 0;
		for (int i = 0; i < arraySeries.length; i++) {
			sum += arraySeries[i];
		}
		double average = sum / (double) arraySeries.length;
		System.out.println("Arithmetic Mean of Series " + Arrays.toString(arraySeries) 
							+ " is \"" + average + "\".");
		input.close();
	}
	
	public static void linearEquation() {
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Input the parameters of your equation a*x + b = 0");
		double a = 0;
		while (a == 0 ) {
			System.out.println("[a <> 0]");
			System.out.print("a = ");
			a = input.nextDouble();
		}
		System.out.print("b = ");
		double b = input.nextDouble();
		
		// Linear Equation a*x + b = 0;
		double x = (-b)/a;
		System.out.println("x = " + x);
		
		input.close();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose the type of task:");
		System.out.println("1) Reverse a number.");
		System.out.println("2) Аrithmetic mean of a series.");
		System.out.println("3) Linear equation (a*x + b = 0).");
		byte choose = 0;
		while (choose < 1 || choose > 3) {
			System.out.print("Choose 1 to 3: ");
			choose = input.nextByte();
		}
		
		switch (choose) {
		case 1: reverseNumber(); break;
		case 2: arithmeticMeanOfSeries(); break;
		case 3: linearEquation(); break;
		}

		input.close();
		
	}

}
