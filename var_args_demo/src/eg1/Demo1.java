package eg1;

public class Demo1 {
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d.sumOfNumbers(1,4,6,2,26,2,7,87));
		System.out.println(d.sumOfNumbers(1,4,6,2));
	}
	
	public int sumOfNumbers(int ...a) {
		int sum = 0;
		
		for(int i:a) {
			sum = sum+i;
		}
		
		return sum;
	}
}

/*
 * ... represents variable args
 * it takes any number of values as input
 * only rule is that it should be the last parameter of your method
 */
