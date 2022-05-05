package Lesson06_Cikli_exercises;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// Напишете програма, която преобразува дадено число от шестнайсе-
		// тична в десетична бройна система.
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете едно число в шестнайсетична бройна система. (Пример 5A0E9)");
		System.out.print("число = ");
		String hex = input.nextLine(); 
		int decimal = Integer.parseInt(hex, 16);  
		System.out.printf("Вашето число в десетична бройна система = %,d", decimal);  

	}

}
