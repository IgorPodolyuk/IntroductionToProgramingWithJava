package exercises;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		// Напишете програма, която за подадени дължина и височина 
		// на правоъгълник, изкарват на конзолата неговият периметър и лице.
		Scanner input = new Scanner(System.in);
		System.out.print("дължина = ");
		int lenght = input.nextInt();
		System.out.print("височина = ");
		int height = input.nextInt();		
		System.out.print("Периметърът (обиколката) на правоъгълника е: " 
				+ 2*(lenght+height));
		System.out.println(", а лицето му е: " + (lenght*height) + ".");
		
	}
	
}
