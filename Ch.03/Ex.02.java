import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		// Напишете булев израз, който да проверява дали дадено
		// цяло число се дели на 5 и на 7 без остатък
		Scanner input = new Scanner(System.in);
		System.out.print("Input your number: a = ");
		int a = input.nextInt();
		boolean result_5 = a % 5 == 0 ? true : false;
		boolean result_7 = a % 7 == 0 ? true : false;
		System.out.println(result_5 ? "Числото \"a\" се дели на 5 без остатък." : "Числото \"a\" не се дели на 5.");
		System.out.println(result_7 ? "Числото \"a\" се дели на 7 без остатък." : "Числото \"a\" не се дели на 7.");
		System.out.println(result_5 && result_7 ? "Числото \"a\" се дели на 5 и на 7 едновременно без остатък." : "Числото \"a\" не се дели на 5 и на 7 едновременно.");
		
	}
	
}
