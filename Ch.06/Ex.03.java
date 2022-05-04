package Lesson06_Cikli_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03v1 {

	public static void main(String[] args) {
		// Напишете програма, която чете от конзолата поредица от цели числа и
		// отпечатва най-малкото и най-голямото от тях.
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете броя на вашите числа.");
		double count = 0;
		while (count <= 0 || count % 1 != 0) {
			System.out.print("Въведете цяло пожително число: ");
			count = input.nextDouble();
		}
		
		double numbers[] = new double[(int) count];
		
		for (int i=0; i<count; i++) {
			System.out.print("Въведете вашето число №" + (i+1) + ": ");
			numbers[i] = input.nextDouble();
		}
		Arrays.sort(numbers);
		System.out.println("Вашето най-малко число е: " + numbers[0]);
		System.out.println("Вашето най-голямо число е: " + numbers[numbers.length-1]);
				
	}

}
