package exercises;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		// Напишете програма, която проверява дали дадена точка О 
		// (x, y) е вътре в окръжността К ((0,0), 5)
		// и е извън правоъгълника ((-1, 1), (-5, 5).
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
		boolean check_x = (x < 1 && x > -1 ? true : false);
		boolean check_y = (y < 5 && x > -5 ? true : false);
		System.out.println(check_x && check_y 
				? "Точката \"O\" с координати x=" + x + " и y=" + y + " е вътре в правоъгълника ((-1,1), (-5,5))." 
				: "Точката \"O\" с координати x=" + x + " и y=" + y + " е извън правоъгълника ((-1,1), (-5,5)).");
		
	}
	
}
