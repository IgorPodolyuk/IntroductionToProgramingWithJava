package Lesson4_exercises;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Дадена фирма има име, адрес, телефонен номер, факс номер, уеб сайт и мениджър. 
		// Мениджърът има име, фамилия и телефонен номер. 
		// Напишете програма, която чете информацията за компанията и нейния мениджър и я отпечатва след това на конзолата.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Име на фирмата: ");
		String companyName = input.nextLine();
		System.out.print("Адрес на фирмата: ");
		String companyAddress = input.nextLine();
		System.out.print("Телефон на фирмата: ");
		String companyTel = input.nextLine();
		System.out.print("Факс на фирмата: ");
		String companyFax = input.nextLine();
		System.out.print("Уебсайт на фирмата: ");
		String companyWeb = input.nextLine();
		System.out.print("Име на управителя: ");
		String managerName = input.nextLine();
		System.out.print("Фамилия на управителя: ");
		String managerFamilyName = input.nextLine();
		System.out.print("Телефон на управителя: ");
		String managerTel = input.nextLine();
		
		System.out.printf("%n\" Данни на фирмата: \" %n" + 
				"Име: %1$s%n" +
				"Адрес: %2$s%n" +
				"Тел. %3$s%n" + 
				"Факс: %4$s%n" + 
				"Уебсайт: %5$s%n" + 
				"Управител: %6$s %7$s, тел. %8$s", 
				companyName, companyAddress, companyTel, companyFax, companyWeb,
				managerName, managerFamilyName, managerTel);
		
	}

}
