package eg1;

public class Demo1 {
	/*
	 * Java provides 8 primitive data types
	 * 
	 * data type		size(byte/bytes)		defaultValue
	 * --------------------------------------------------------------
	 * byte				1 						0
	 * short			2 						0
	 * int				4						0
	 * long				8						0 any long variable end it with L
	 * 
	 * float			4						0 any float variable end it with f
	 * double			8						0 java takes all the decimal values as double by default
	 * 
	 * char				2						'\u00000' java supports UNI-CODE charset
	 * 
	 * boolean			1 bit					false
	 */
	
	public static void main(String[] args) {
		
		int x = 10;
		System.out.println("x: " + x);
		
		float z = 1.23462f;
		System.out.println("z: " + z);
		
		long contact = 129489567610l;
		System.out.println("contact: " + contact);
		
		char c = 'M';
		System.out.println(c);
		
		String s1 = "Leon";
		System.out.println("s1: " + s1);
		
		double d = 23.8234756d;
		System.out.println("d: " + d);
		
		//Arithmetic operators
		System.out.println("x + z: " + (float)(x + z));
		System.out.println("");
		
		//relational operators
		System.out.println(contact>d);
		System.out.println(contact==d);
	}
	
}
