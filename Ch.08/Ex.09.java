package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;

public class Ex09_2to16 {

	public static void main(String[] args) {
		// Да се напише програма, която преобразува двоично число в шестна-десетично.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Only numbers 0 and 1 are allowed.");
		System.out.print("Input your number in binary: x = ");
		char[] arrayChar = input.next().toCharArray();
		boolean binary = true;
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] != '0' && arrayChar[i] != '1') {
				System.out.println("Your number is not binary.");
				binary = false;
				break;
			}
		}
		
		if (binary == false) {
			System.out.println();
		} else {
			if (arrayChar.length % 4 == 0) {
				String[] newArrayString = new String[arrayChar.length];
				for (int i = 0; i < newArrayString.length; i++) {
					newArrayString[i] = String. valueOf(arrayChar[i]);
				}
				
				String[] newArrayString2 = new String[newArrayString.length / 4];
				for (int i = 0; i < newArrayString2.length; i++) {
					String first = newArrayString[0+i*4];
					String second = newArrayString[1+i*4];
					String third = newArrayString[2+i*4];
					String forth = newArrayString[3+i*4];
					newArrayString2[i] = String.valueOf(first+second+third+forth);
				}
				
				System.out.print("Your number in hexadecimal = ");
				for (int i = 0; i < newArrayString2.length; i++)
				switch (newArrayString2[i]) {
				case "0000" : System.out.print(0); break;
				case "0001" : System.out.print(1); break;
				case "0010" : System.out.print(2); break;
				case "0011" : System.out.print(3); break;
				case "0100" : System.out.print(4); break;
				case "0101" : System.out.print(5); break;
				case "0110" : System.out.print(6); break;
				case "0111" : System.out.print(7); break;
				case "1000" : System.out.print(8); break;
				case "1001" : System.out.print(9); break;
				case "1010" : System.out.print('A'); break;
				case "1011" : System.out.print('B'); break;
				case "1100" : System.out.print('C'); break;
				case "1101" : System.out.print('D'); break;
				case "1110" : System.out.print('E'); break;
				case "1111" : System.out.print('F'); break;
				}
				
			} else {
				String[] initialArrayString = new String[arrayChar.length];
				for (int i = 0; i < initialArrayString.length; i++) {
					initialArrayString[i] = String. valueOf(arrayChar[i]);
				}
				String[] newArrayString = new String[initialArrayString.length + (4 - initialArrayString.length % 4)];
				for (int i = 0; i < newArrayString.length; i++) {
					newArrayString[i] = "0";
				}
				for (int i = newArrayString.length-1; i >= (newArrayString.length-1)-(initialArrayString.length-1); i--) {
					newArrayString[i] = initialArrayString[i-(4 - initialArrayString.length % 4)];
				}
				String[] newArrayString2 = new String[newArrayString.length / 4];
				for (int i = 0; i < newArrayString2.length; i++) {
					String first = newArrayString[0+i*4];
					String second = newArrayString[1+i*4];
					String third = newArrayString[2+i*4];
					String forth = newArrayString[3+i*4];
					newArrayString2[i] = String.valueOf(first+second+third+forth);
				}
				
				System.out.print("Your number in hexadecimal = ");
				for (int i = 0; i < newArrayString2.length; i++)
				switch (newArrayString2[i]) {
				case "0000" : System.out.print(0); break;
				case "0001" : System.out.print(1); break;
				case "0010" : System.out.print(2); break;
				case "0011" : System.out.print(3); break;
				case "0100" : System.out.print(4); break;
				case "0101" : System.out.print(5); break;
				case "0110" : System.out.print(6); break;
				case "0111" : System.out.print(7); break;
				case "1000" : System.out.print(8); break;
				case "1001" : System.out.print(9); break;
				case "1010" : System.out.print('A'); break;
				case "1011" : System.out.print('B'); break;
				case "1100" : System.out.print('C'); break;
				case "1101" : System.out.print('D'); break;
				case "1110" : System.out.print('E'); break;
				case "1111" : System.out.print('F'); break;
				}
			}
		}

	}

}
