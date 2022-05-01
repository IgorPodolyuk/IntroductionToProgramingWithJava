package Lesson05_exercises;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Да се напише if-конструкция, която изчислява стойността 
		// на две целочислени променливи и разменя техните стойности, 
		// ако стойността на първата променлива е по-голяма от втората.
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете две цели числа: ");
		System.out.print("a = ");
		int a_Initial = input.nextInt();
		System.out.print("b = ");
		int b_Initial = input.nextInt();
		
		if (a_Initial > b_Initial) {
			System.out.println("a > b => разменяме стойностите на а и b");
			int a = b_Initial;
			int b = a_Initial;
			System.out.println("a = " + a + " b = "+ b);
		} else if (a_Initial == b_Initial) {
			System.out.println("a = b = " + a_Initial);
		} else {
			System.out.println("a < b => не разменяме стойностите на а и b");
			System.out.println("a = " + a_Initial + "; b = "+ b_Initial + ";");
		}

	}

}
