package assignment_12162020_wrappers;

public class WarpperFloat {

	public static void main(String[] args) {
		Float f1 = 10168.4742f;
		Float f2 = 10168.4742f;
		Float f3 = new Float(10168.4742f);
		
		System.out.println("l1 = "+ f1);
		System.out.println("l2 = "+ f2);
		System.out.println("l3 = "+ f3);
		System.out.println("l1==l2 "+(f1==f2));
		System.out.println("l1==l3 "+(f1==f3));
		
		System.out.println("l1.equals(l2) ="+f1.equals(f2));
		System.out.println("l1.equals(l3) ="+f1.equals(f3));
		
		float f = f1; //AutoBoxing
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Java reads everthing as String and java writes everything as String
		String s = "3372347.3345";
		Float number = Float.parseFloat(s); //similar method in all other Wrapper classes except Character.
		System.out.println("number = "+number);
		
		number = 99894654.498f;
		s = number+"";
		System.out.println(s);
		
		Float i5 = 1000f;
		s=i5.toString();
		System.out.println(s);
		
		//System.out.println(Float.toBinaryString(1000000));
		System.out.println(Float.toHexString(1000000));
		//System.out.println(Float.toOctalString(1000000));
		
		//compare to = if 1st object is greater then the 2nd, it will return +1 if it is same it will return 0 else -1
		System.out.println(i5);
		System.out.println("i5.compareTo(1000): " + i5.compareTo(1000f));
		System.out.println("i5.compareTo(2000): " + i5.compareTo(2000f));
		System.out.println("i5.compareTo(100): " + i5.compareTo(100f));

	}

}
