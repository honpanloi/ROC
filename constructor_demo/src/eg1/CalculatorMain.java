package eg1;

public class CalculatorMain {

	public static void main(String[] args) {
	
		Calculator c1 = new Calculator("Leon");
		
		Calculator c2 = new Calculator(1);
		
		Calculator c3 = new Calculator(2, 4);
		
		System.out.println(c1.add());
		System.out.println(c2.add());
		System.out.println(c3.add());
		System.out.println(c3.mutiply());

	}

}
