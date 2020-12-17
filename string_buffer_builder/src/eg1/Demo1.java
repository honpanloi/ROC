package eg1;

public class Demo1 {
	
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("hello");
		System.out.println(sb1);
		sb1.append(" hey").append(1234).append(455.121).append('f');
		System.out.println(sb1);
		
		sb1.insert(0, "JAVA");
		System.out.println(sb1);
		
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		System.out.println(sb1.length());
		
		StringBuffer sb2 = new StringBuffer("hello");
		StringBuffer sb3 = new StringBuffer("hello");
		
		System.out.println(sb2.equals(sb3));
		/*
		 * compares addresses because equals is not available in buffer or builder
		 * classes, so by default equals from object will compare addresses same way as ==. 
		 */
		
		System.out.println(sb2.toString().equals(sb3.toString()));
		System.out.println(sb2 == sb3);
		
		StringBuffer sb4 = new StringBuffer("eeeleee");
		System.out.println(sb4.equals(sb4.reverse()));
	}
}
