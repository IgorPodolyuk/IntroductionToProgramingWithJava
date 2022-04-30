public class Ex01 {
	
	public static void main(String[] args) {
		// Напишете израз, който да проверява дали дадено
		// цяло число е четно или нечетно
		int a = 11;
		int b = 2;
		int ostatyk_a = (a % 2);
		int ostatyk_b = (b % 2);
		System.out.println(ostatyk_a == 0 
				? "Числото \"а\" e четно."
				: "Числото \"а\" e нечетно.");
		System.out.println(ostatyk_b == 0 
				? "Числото \"b\" e четно."
				: "Числото \"b\" e нечетно.");
		
	}
	
}
