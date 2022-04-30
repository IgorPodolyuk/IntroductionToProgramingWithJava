package exercises;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		// Силата на гравитационното поле на луната е приблизително 17% 
		// от това на земята. Напишете програма, която да изчислява
		// тежестта на човек на луната, по дадената тежест на земята.
		Scanner input = new Scanner(System.in);
		System.out.print("Input the weight: ");
		int weight_Earth = input.nextInt();		
		System.out.print("Тежестта на човека на Земята е: " 
				+ weight_Earth + "кг");
		System.out.println(", а на Луната е: " 
				+ weight_Earth * (float) 0.17 + "кг.");
		
	}
	
}
