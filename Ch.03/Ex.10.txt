package exercises;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		// Напишете програма, която приема за вход четирицифрено
		// число във формат abcd и след това извършва следните действия
		// върху него:
		Scanner input = new Scanner(System.in);
		System.out.println("Напишете едно цяло четирицифрено число:");
		System.out.print("a = ");
		int a = input.nextInt();
		if ((a>=1000) && (a<=9999)) {
			// - Пресмята сбора от цифрите на числото.
			int edinici = a % 10;
			int desetici = (a / 10) % 10;
			int stotici = ((a / 10) / 10) % 10;
			int hilqdni = (((a / 10) / 10) / 10) % 10;
			int sbor = edinici + desetici + stotici + hilqdni;
			System.out.println("Сборът от цифрите на числото " 
			+ a + " е " + sbor);
			
			// - Разпечатва на конзолата цифрите в обратен ред: dcba.
			System.out.println("Вашето число в обратен ред е " 
					+ edinici + desetici + stotici + hilqdni);
			
			// - Поставя последната цифра, на първо място: dabc.
			System.out.println("Ако се постави последната цифра на "
					+ "първо място вашето число е " 
					+ edinici + hilqdni + stotici + desetici);
			
			// - Разменя мястото на втората и третата цифра: acbd.
			System.out.println(	"Ако се размени мястото на втората "
					+ "и третата цифра вашето число е " 
					+ hilqdni + desetici + stotici + edinici);
		} else {
			System.out.println("Не сте въвели четирицифрено число!");
		}
		
	}
	
}
