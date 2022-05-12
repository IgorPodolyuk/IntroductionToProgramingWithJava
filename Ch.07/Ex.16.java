package Lesson07_masivi_arrays_exercises;

public class Ex16 {
	
	// Напишете програма, която намира всички прости числа в диапазона
	// [1..10 000 000]. (Sieve of Eratosthenes)
	
	void sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n+1];
        for(int i = 0 ; i <= n ; i++)
            prime[i] = true;
         
        for(int p = 2 ; p*p <= n ; p++) {
            if(prime[p] == true) {
               for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        for(int i = 2; i <= n; i++) {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
     
    public static void main(String args[]) {
    	int n = 10_000_000;
        System.out.println("Following are the prime numbers smaller than or equal to " + n);
        Ex16 g = new Ex16();
        g.sieveOfEratosthenes(n);
    }

}
