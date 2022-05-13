package Lesson_08_Broini_Sistemi_exercises;

public class Ex02_2to16to10 {
	
	public static void main(String[] args) {
		
		// Превърнете числото 1111_0101_1001_1110(2)
		// в шестнадесетична и десетична бройна система.
		
		int a = 0b1111_0101_1001_1110;
		System.out.printf("a(2 binary) = %s%n", Integer.toBinaryString(a));
		System.out.printf("a(10 decimal) = %,d%n", a);
		System.out.printf("a(16 hex = hexadecimal) = %s%n", Integer.toHexString(a));
		
	}
	
}
