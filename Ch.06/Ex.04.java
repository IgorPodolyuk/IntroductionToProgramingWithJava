package Lesson06_Cikli_exercises;

public class Ex04 {
	
	public static void main(String[] args) {
		// Напишете програма, която отпечатва всички възможни карти от
		// стандартно тесте без джокери (имаме 52 карти: 4 бои по 13 карти).
		String[] signs = { "спатия", "каро", "купа", "пика" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A" };
		
		for ( int row=0;  row <= 12; row++) {
			for (int col = 0; col <= 3; col++) {
				System.out.print(cards[row] + " " + signs[col] + " / ");
			}
			System.out.println();
		}
		
	}
	
}
