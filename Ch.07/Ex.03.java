package Lesson07_masivi_arrays_exercises;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Да се напише програма, която сравнява два масива от тип char 
		// лексикографски (буква по буква) и проверява кой от двата е 
		// по-рано в лексикографската подредба.
		Scanner input = new Scanner(System.in);
				
		System.out.print("Въведете думата в първия масив: ");
		char[] array1 = input.next().toCharArray();
		System.out.print("Въведете думата във втория масив: ");
		char[] array2 = input.next().toCharArray();
		
		int shorterArray = Math.min(array1.length, array2.length);
		
		boolean equal = true;
		for (int i=0; i<shorterArray; i++) {
			if (array1[i] == array2[i]) {
				equal = true;
			} else if (array1[i] > array2[i]) {
				System.out.println("Вторият масив е по-рано в лексикографската подредба!");
				equal = false;
				break;
			} else {
				System.out.println("Първият масив е по-рано в лексикографската подредба!");
				equal = false;
				break;
			}
		}
		
		if (equal == true) {
			if (array1.length < array2.length) {
				System.out.println("Първият масив е по-рано в лексикографската подредба.");
			} else if (array1.length > array2.length){
				System.out.println("Вторият масив е по-рано в лексикографската подредба.");
			} else {
				System.out.println("Масивите съвпадат. Никой не е лексикографски по-рано.");
			}
		} 
		
	}

}
