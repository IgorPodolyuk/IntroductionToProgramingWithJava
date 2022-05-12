package Lesson07_masivi_arrays_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// Да се напише програма, която създава масив с всички букви от
		//латинската азбука. Да се даде възможност на потребител да въвежда
		//дума от конзолата и в резултат да се извеждат индексите на буквите от
		//думата.
		
		byte englishAlphabetLetters = 26;
		char[] alphabet = new char[englishAlphabetLetters]; // English alphabet has 26 letters;
		for (byte i = 1 ; i <= englishAlphabetLetters ; i++) {
			alphabet[i-1] = (char) (96 + i); // 'a' = 97;
			System.out.printf("index %1$d = %2$c; ", i, alphabet[i-1]);
			if (i%5 == 0) {
				System.out.println();
			}
		}
		System.out.printf("%n%n");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете вашата дума и проверете индексите на буквите от думата: ");
		char[] array = input.next().toLowerCase().toCharArray();
		System.out.println(Arrays.toString(array));
		System.out.print("[");
		for ( int i = 0; i < array.length ; i++) {
			System.out.print((int) array[i] - (int) 'a' + 1);
			if (i < array.length-1) {
				System.out.print(", ");
			} else {
				System.out.println("]");
			}
		}

	}

}
