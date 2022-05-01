package exercises;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		// Напишете израз, който изчислява площта на трапец 
		// по дадени a, b и h.
		Scanner input = new Scanner(System.in);
		System.out.print("a = ");
		int a = input.nextInt();
		System.out.print("b = ");
		int b = input.nextInt();
		System.out.print("h = ");
		int h = input.nextInt();
		System.out.print( "Площта (лицето) на трапеца е: S = " 
				+ ((a+b)/2.0)*h );
		
	}
	
}
