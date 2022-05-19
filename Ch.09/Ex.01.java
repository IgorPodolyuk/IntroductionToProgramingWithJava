package Lesson_09_Methods_exercises;

import java.util.Scanner;

public class Ex01_HelloName {
	// Напишете метод, който при подадено име отпечатва в конзолата "Hello, <name>!" 
	//(например "Hello, Peter!"). Напишете програма, която тества този метод.
	
	public static void printGreeting(String name) {
		System.out.printf("Hello, %s!", name);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input your name: ");
		String name = input.next();
		printGreeting(name);
		input.close();
	}

}
