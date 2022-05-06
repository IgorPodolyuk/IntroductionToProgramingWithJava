package Lesson07_masivi_arrays_exercises;

import java.util.Scanner;
import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// Да се напише програма, която чете два масива от конзолата
		// и проверява дали са еднакви.
		Scanner input = new Scanner(System.in);
		System.out.print("Въведете броя на елементите в първия масив: ");
		int array1Length = input.nextInt();
		System.out.print("Въведете броя на елементите във втория масив: ");
		int array2Length = input.nextInt();
		if (array1Length == array2Length) {
			int[] array1 = new int[array1Length];
			int[] array2 = new int[array2Length];
			
			System.out.println("Въведете елементите в първия масив.");
			for (int i=0 ; i<array1Length ; i++) {
			System.out.print("Масив No.1, елемент No." + i + " = ");
			array1[i] = input.nextInt();
			}
			
			System.out.println("Въведете елементите във втория масив.");
			for (int i=0 ; i<array2Length ; i++) {
			System.out.print("Масив No.2, елемент No." + i + " = ");
			array2[i] = input.nextInt();
			}
			
			boolean equal = true;
			for (int i=0; i<array1Length; i++) {
				if (array1[i] != array2[i])
				equal = false;
				if (equal == false) // Stop comparing if equal == false
				break;
			}
			
			if (equal == true)
				System.out.printf("Масив No.1 = Масив No.2%n"
						+ Arrays.toString(array1) + "%n"
						+ Arrays.toString(array2) + "%n");
			else
				System.out.printf("Масив No.1 е различен от Масив No.2%n"
						+ Arrays.toString(array1) + "%n"
						+ Arrays.toString(array2) + "%n");
		
		} else {
			System.out.printf("Масив No.1 е различен от Масив No.2.%n"
					+ "Масивите са с различна дължина.%n");
		}

	}

}
