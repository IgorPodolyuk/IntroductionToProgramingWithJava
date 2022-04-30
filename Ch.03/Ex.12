package exercises;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// Дадено е число n, стойност v (v = 0 или 1) и позиция p. 
		// Напишете поредица от операции, които да променят стойността на n, 
		// така че битът на позиция p да има стойност v.
		// Пример n=35, p=5, v=0 -> n=3. (? p=5->0)
		// Още един пример: n=35, p=2, v=1 -> n=39. (? p=2->1)
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input your number n = ");
		int n = input.nextInt();
		System.out.println("Your number is n = " + n + "; in binary is n = " + Integer.toBinaryString(n));
		
		int p=0;
		System.out.print("Input the bit position for changing from right (p>=1) p = ");
		while (true) {
			p = input.nextInt();
			if (p>=1)
				break;
			System.out.print("Enter the bit position for changing from right (p>=1) p = ");
		}
			
		int v = 0;
		System.out.print("Input the new bit value (0 or 1) v = ");
		while (true) {
			v = input.nextInt();
			if (v==0 || v==1)
				break;  // break the infinite loop if the user input number 0 or 1
			System.out.print("Enter a bit number value (0 or 1) v = ");
		}
		
		int shift1 = n>>p;
		// System.out.println(shift1 + " = " + Integer.toBinaryString(shift1));
		int shift2 = shift1<<1;
		// System.out.println(shift2 + " = " + Integer.toBinaryString(shift2));
		int newValue = shift2 + v;
		// System.out.println(newValue + " = " + Integer.toBinaryString(newValue));
		int shift3 = newValue << (p-1);
		// System.out.println(shift3 + " = " + Integer.toBinaryString(shift3));
		int addValue = (int) (n % (Math.pow(2, (p-1))));
		// System.out.println(addValue + " = " + Integer.toBinaryString(addValue));
		int answer = shift3 + addValue;
		// System.out.println(answer + " = " + Integer.toBinaryString(answer));
		System.out.println("Your new number is n = " + answer + "; in binary is n = " + Integer.toBinaryString(answer));
		
	}

}
