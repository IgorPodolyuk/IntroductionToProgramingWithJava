package exercises;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		// Напишете програма, която проверява дали дадена точка О 
		// (x, y) е вътре в окръжността К ((0,0), 5).
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете координатите (x, y) на т.О:");
		System.out.print("x = ");
		int x = input.nextInt();
		System.out.print("y = ");
		int y = input.nextInt();
		double c = Math.sqrt((x*x) + (y*y));		
		System.out.println(c < 5 
				? "Точката \"O\" с координати x=" + x +" и y=" + y + " е вътре в окръжността К((0,0), 5)." 
				: "Точката \"O\" с координати x=" + x +" и y=" + y + " е извън окръжността К((0,0), 5).");
		
	}
	
}
