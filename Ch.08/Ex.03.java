package Lesson_08_Broini_Sistemi_exercises;

public class Ex03_16to2to10 {
	
	public static void main(String[] args) {
		
		// Превърнете шестнайсетичните числа 2A3E, FA, FFFF, 5A0E9
		// в двоична и десетична бройна система.
		
		int num1 = 0x2a3e;
		int num2 = 0xfa;
		int num3 = 0xffff;
		int num4 = 0x5a0e9;
		System.out.printf("num1(10,2) = %,d = %s%n", num1, Integer.toBinaryString(num1));
		System.out.printf("num2(10,2) = %,d = %s%n", num2, Integer.toBinaryString(num2));
		System.out.printf("num3(10,2) = %,d = %s%n", num3, Integer.toBinaryString(num3));
		System.out.printf("num4(10,2) = %,d = %s%n", num4, Integer.toBinaryString(num4));

	}

}
