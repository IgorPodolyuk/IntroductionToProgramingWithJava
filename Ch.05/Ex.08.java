package Lesson05_exercises;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		// Напишете програма, която прилага бонус точки към дадени точки в
		// интервала [1..9] чрез прилагане на следните правила:
		// - Ако точките са между 1 и 3, програмата ги умножава по 10.
		// - Ако точките са между 4 и 6, ги умножава по 100.
		// - Ако точките са между 7 и 9, ги умножава по 1000.
		// - Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		while (x < 1 | x > 9) {
			System.out.println("Въведете броя на точките между 1 и 9: ");
			System.out.print("Брой точки = ");
			x = input.nextInt();
		}
		
		switch (x) {
		case 1:
		case 2:
		case 3: System.out.println("Вашите бонус точки са: " + x*10); break;
		case 4:
		case 5:
		case 6: System.out.println("Вашите бонус точки са: " + x*100); break;
		case 7:
		case 8:
		case 9: System.out.println("Вашите бонус точки са: " + x*1000); break;
		default:
		}
		
	}
	
}
