package Lesson_08_Broini_Sistemi_exercises;

import java.util.Scanner;

public class Ex13_DecimalToRM2p {

	public static void main(String[] args) {
		// Да се напише програма, която определя (отпечатва) стойността на мантисата, 
		//знака на мантисата и стойността на експонентата за числа от тип float и double.
		
		Scanner input = new Scanner(System.in);
		float r = 0;
		System.out.println("R = (S) M * 2^p");
		System.out.println("Знак на мантисата(S); Eкспонента(p); Mантисата(M);");	
		System.out.print("Enter your number R = ");
		r = input.nextFloat(); // example: -21.15625
		String numberString = Integer.toBinaryString(Float.floatToRawIntBits(r));
		
		if (r == 0) {
			System.out.println("R = 0");
		} else if (r < 0) {
			char[] charArray = new char[32];
			for (int i = 0; i < charArray.length; i++) {
				charArray[i] = numberString.charAt(i);
	    }
			//charArray[0] - always 1 if R<0
			System.out.println("Знакът на мантистата(S): (-)");
			// create Eкспонента(p), pArray[8], reverse
			int[] pArray = new int[8];
			for (int i = 0; i < pArray.length; i++) {
				pArray[i] = Integer.parseInt("" + charArray[8-i]);
			}
			//calculate value of (p) (p =  - 127 + (i*2^i...))
			int p = -127;
			for (int i = 0; i < pArray.length; i++) {
				p += pArray[i] * Math.pow(2, i);
			}
			System.out.println("Eкспонента(p): " + p);
			// create Mантисата(M), mArray[23]
			int[] mArray = new int[23];
			for (int i = 0; i < mArray.length; i++) {
				mArray[i] = Integer.parseInt("" + charArray[i+9]);
			}
			//calculate value of (M) (M = 1 + (i*2^-(i+1))...))
			double m = 1;
			for (int i = 0; i < mArray.length; i++) {
				m += mArray[i] * Math.pow(2, -(i+1));
			}
			System.out.println("Mантисата(M): " + m);
			double check = (m*Math.pow(2, p));
			System.out.printf("Check = -%.7f", check);
		} else if (r > 1.999999940395) {
			char[] charArray = new char[32];
			for (int i = 0; i < charArray.length; i++) {
				charArray[i] = '0';
	    }
			//replace values of charArray with numberString shifted by 1 bit to right
			for (int i = 1; i < charArray.length; i++) {
				charArray[i] = numberString.charAt(i-1);
			}
			//charArray[0] - always 0 if R>0
			System.out.println("Знакът на мантистата(S): (+)");
			// create Eкспонента(p), pArray[8], reverse
			int[] pArray = new int[8];
			for (int i = 0; i < pArray.length; i++) {
				pArray[i] = Integer.parseInt("" + charArray[8-i]);
			}
			//calculate value of (p) (p =  - 127 + (i*2^i...))
			int p = -127;
			for (int i = 0; i < pArray.length; i++) {
				p += pArray[i] * Math.pow(2, i);
			}
			System.out.println("Eкспонента(p): " + p);
			// create Mантисата(M), mArray[23]
			int[] mArray = new int[23];
			for (int i = 0; i < mArray.length; i++) {
				mArray[i] = Integer.parseInt("" + charArray[i+9]);
			}
			//calculate value of (M) (M = 1 + (i*2^-(i+1))...))
			double m = 1;
			for (int i = 0; i < mArray.length; i++) {
				m += mArray[i] * Math.pow(2, -(i+1));
			}
			System.out.println("Mантисата(M): " + m);
			double check = (m*Math.pow(2, p));
			System.out.printf("Check = +%.7f", check);
		} else if (r > 0 && r <= 1.999999940395) {
			char[] charArray = new char[32];
			for (int i = 0; i < charArray.length; i++) {
				charArray[i] = '0';
	    }
			//replace values of charArray with numberString shifted by 2 bits to right
			for (int i = 2; i < charArray.length; i++) {
				charArray[i] = numberString.charAt(i-2);
			}
			//charArray[0] - always 0 if R>0
			System.out.println("Знакът на мантистата(S): (+)");
			// create Eкспонента(p), pArray[8], reverse
			int[] pArray = new int[8];
			for (int i = 0; i < pArray.length; i++) {
				pArray[i] = Integer.parseInt("" + charArray[8-i]);
			}
			//calculate value of (p) (p =  - 127 + (i*2^i...))
			int p = -127;
			for (int i = 0; i < pArray.length; i++) {
				p += pArray[i] * Math.pow(2, i);
			}
			System.out.println("Eкспонента(p): " + p);
			// create Mантисата(M), mArray[23]
			int[] mArray = new int[23];
			for (int i = 0; i < mArray.length; i++) {
				mArray[i] = Integer.parseInt("" + charArray[i+9]);
			}
			//calculate value of (M) (M = 1 + (i*2^-(i+1))...))
			double m = 1;
			for (int i = 0; i < mArray.length; i++) {
				m += mArray[i] * Math.pow(2, -(i+1));
			}
			System.out.println("Mантисата(M): " + m);
			double check = (m*Math.pow(2, p));
			System.out.printf("Check = +%.7f", check);
		}

	}

}
