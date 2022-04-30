public class Ex10 {
	
	public static void main(String[] args) {
		
		// Exchange value of two variables
		int number1 = 5;
		int number2 = 10;
		int a;
		int b;
		a = number2;
		b = number1;
		boolean check1 = ( a == number1 );
		boolean check2 = ( b == number1 );	
		
		// Print the result to the console
		System.out.println("a = " + a);
		System.out.println("b = " + b);	
		
		if (check1) {
			System.out.println("a = " + number1);
		} else {
			System.out.println("a = "  + number2);
		}
		if (check2) {
			System.out.println("b = " + number1);
		} else {
			System.out.println("b = " + number2);
		}
		
	}
	
}
