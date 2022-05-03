package Lesson05_exercises;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// Напишете програма, която преобразува дадено число в интервала
		// [0..999] в текст, съответстващ на българското произношение. Примери:
		// - 0  "Нула"
		// - 273  "Двеста седемдесет и три"
		// - 400  "Четиристотин"
		// - 501  "Петстотин и едно"
		// - 711  "Седемстотин и единадесет"
		
		Scanner input = new Scanner(System.in);
		
		int x = -1;
		while (x < 0 | x > 999) {
			System.out.println("Въведете едно цяло число между 0 и 999: ");
			System.out.print("x = ");
			x = input.nextInt();
		}
				
		int xEdinici = x % 10;
		int xDesetici = ((x / 10) % 10);
		int xStotici = x / 100;
		
		String edinici = "";
		switch (xEdinici) {
		case 0: edinici = "нула"; break;
		case 1: edinici = "едно"; break;
		case 2: edinici = "две"; break;
		case 3: edinici = "три"; break;
		case 4: edinici = "четири"; break;
		case 5: edinici = "пет"; break;
		case 6: edinici = "шест"; break;
		case 7: edinici = "седем"; break;
		case 8: edinici = "осем"; break;
		case 9: edinici = "девет"; break;
		}
			
		String osobeni = "";
		if (xDesetici == 1) {
			switch (xEdinici) {
			case 0: osobeni = "десет"; break;
			case 1: osobeni = "единадесет"; break;
			case 2: osobeni = "дванадесет"; break;
			case 3: osobeni = "тринадесет"; break;
			case 4: osobeni = "четиринадесет"; break;
			case 5: osobeni = "петнадесет"; break;
			case 6: osobeni = "шестнадесет"; break;
			case 7: osobeni = "седемнадесет"; break;
			case 8: osobeni = "осемнадесет"; break;
			case 9: osobeni = "деветнадесет"; break;
			}
		}
			
		String desetici = "";
		if (xDesetici > 1) {
			switch (xDesetici) {
			case 2: desetici = "двадесет"; break;
			case 3: desetici = "тридесет"; break;
			case 4: desetici = "четиридесет"; break;
			case 5: desetici = "петдесет"; break;
			case 6: desetici = "шестдесет"; break;
			case 7: desetici = "седемдесет"; break;
			case 8: desetici = "осемдесет"; break;
			case 9: desetici = "деветдесет"; break;
			}
		}
		
		String stotici = "";
		switch (xStotici) {
		case 1: stotici = "сто"; break;
		case 2: stotici = "двеста"; break;
		case 3: stotici = "триста"; break;
		case 4: stotici = "четиристотин"; break;
		case 5: stotici = "петстотин"; break;
		case 6: stotici = "шестстотин"; break;
		case 7: stotici = "седемстотин"; break;
		case 8: stotici = "осемстотин"; break;
		case 9: stotici = "деветстотин"; break;
		default: stotici = ""; break;
		}
		
		
		if (xStotici == 0 && xDesetici == 0) {
			System.out.println(edinici);
		} else if (xStotici == 0 && xDesetici == 1) {
			System.out.println(osobeni);
		} else if (xStotici == 0 && xDesetici > 1 && xEdinici == 0) {
			System.out.println(desetici);
		} else if (xStotici == 0 && xDesetici > 1 && xEdinici != 0) {
			System.out.println(desetici + " и " + edinici);
		} else if (xStotici != 0 && xDesetici == 0 && xEdinici == 0) {
			System.out.println(stotici);
		} else if (xStotici != 0 && xDesetici == 0 && xEdinici != 0) {
			System.out.println(stotici + " и " + edinici);
		} else if (xStotici != 0 && xDesetici == 1) {
			System.out.println(stotici + " и " + osobeni);
		} else if (xStotici != 0 && xDesetici > 1 && xEdinici == 0) {
			System.out.println(stotici + " и " + desetici);
		} else if (xStotici != 0 && xDesetici > 1 && xEdinici != 0) {
			System.out.println(stotici + " " + desetici + " и " + edinici);
		}
		
	}

}
