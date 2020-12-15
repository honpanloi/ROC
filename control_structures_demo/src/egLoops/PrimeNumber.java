package egLoops;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println("Printing all prime numbers between 1 and 100");
		for (int i = 0; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.println(i +"");
			}
			
		}

	}
	
	public static boolean isPrime(int n) {
		boolean b = false;
		
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				c++;
			}
		}
		
		if(c ==2) {
			b = true;
		}
		
		return b;
	}

}

/*
 * Try to recreate the same
 * 1)Create a class with a method which g
 * /
 */