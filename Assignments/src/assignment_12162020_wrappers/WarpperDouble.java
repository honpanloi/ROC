package assignment_12162020_wrappers;

public class WarpperDouble {

	public static void main(String[] args) {
		
		Double d1 = 10168.4742d;
		Double d2 = 10168.4742d;
		Double d3 = new Double(10168.4742d);
		
		System.out.println("l1 = "+ d1);
		System.out.println("l2 = "+ d2);
		System.out.println("l3 = "+ d3);
		System.out.println("l1==l2 "+(d1==d2));
		System.out.println("l1==l3 "+(d1==d3));
		
		System.out.println("l1.equals(l2) ="+d1.equals(d2));
		System.out.println("l1.equals(l3) ="+d1.equals(d3));
		
		double d = d1; //AutoBoxing
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Java reads everthing as String and java writes everything as String
		String s = "3372347.3345";
		Double number = Double.parseDouble(s); //similar method in all other Wrapper classes except Character.
		System.out.println("number = "+number);
		
		number = 99894654.498d;
		s = number+"";
		System.out.println(s);
		
		Float i5 = 1000f;
		s=i5.toString();
		System.out.println(s);
		
		//System.out.println(Double.toBinaryString(1000000));
		System.out.println(Double.toHexString(1000000));
		//System.out.println(Double.toOctalString(1000000));
		
		//compare to = if 1st object is greater then the 2nd, it will return +1 if it is same it will return 0 else -1
		System.out.println(i5);
		System.out.println("i5.compareTo(1000): " + i5.compareTo(1000f));
		System.out.println("i5.compareTo(2000): " + i5.compareTo(2000f));
		System.out.println("i5.compareTo(100): " + i5.compareTo(100f));

	}

}
