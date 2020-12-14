package eg_casting;

public class CastingDemo {
	/*
	 * Casting/Type Casting - Conversion of one data type to another.
	 * 
	 * 2 Types of Casting
	 * 1) Implicit Casting - Taken care by java complier implicitly when the smaller data is assigned to the larger data type.
	 * 2) Explicit Casting - Done by programmers = when we would like to convert the larger type to the smaller one.
	 */
	
	public static void main(String[] args) {

		int x = 100;
		float m = x; //implicit casting
		System.out.println("x = "+x);
		System.out.println("m = "+m);
		
		m = 89.975f;
		System.out.println("m = "+m);
		
		double d = m;  //implicit casting
		System.out.println("d = "+d);
		
		
		char c = 'Y';
		int q=c; //implicit
		System.out.println("q = "+q);
		
		q++;  //q = q+1;
		c = (char)q; //explicit
		System.out.println("c ="+c);
		
		System.out.println("m = "+m);
		x = (int)m; //explicit
		System.out.println("x = "+x);
		
	}

}
