package Lesson_08_Broini_Sistemi_exercises;

public class Ex01_10to2 {
	
	public static void main(String[] args) {
		
		// Превърнете числата 151, 35, 43, 251 и -0,41 
		// в двоична бройна система.
		int num1 = 151;
		int num2 = 35;
		int num3 = 43;
		int num4 = 251;
		double num5d = -0.41;
		System.out.println("num1 = " + num1 + " = " + Integer.toBinaryString(num1));
		System.out.println("num2 = " + num2 + " = " + Integer.toBinaryString(num2));
		System.out.println("num3 = " + num3 + " = " + Integer.toBinaryString(num3));
		System.out.println("num4 = " + num4 + " = " + Integer.toBinaryString(num4));
		long bits = Double.doubleToLongBits(num5d);
		System.out.println("num5 = " + num5d + " = " + Long.toBinaryString(bits));
		
	}
	
}
