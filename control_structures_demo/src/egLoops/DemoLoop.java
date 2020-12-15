package egLoops;

public class DemoLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = "+i);
		}
		
		for (int i = 0, j = 10; i < 10; i++,j--) {
			System.out.println("i = "+i +" j = "+j);
		}
		
		System.out.println();
		System.out.println("Printing all even numbers between 1 and 50");
		for (int i = 0; i <= 50; i++) {
			if(i%2 == 0) {
				System.out.println(i + " ");
			}
				
		}
		
		System.out.println();
		int x = 0;
		while(x != 10) {
			System.out.println("x = "+x);
			x++;
		}
		
		System.out.println();
		System.out.println("Value of x before do while = " + x);
		
		do {
			System.out.println("I will be excuted once for sure");
		}while(x!=10);

	}

}
