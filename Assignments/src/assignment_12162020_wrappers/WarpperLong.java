package assignment_12162020_wrappers;

public class WarpperLong {

	public static void main(String[] args) {
		
		Long l1 = 101684742L;
		Long l2 = 101684742L;
		Long l3 = new Long(101684742L);
		
		System.out.println("l1 = "+ l1);
		System.out.println("l2 = "+ l2);
		System.out.println("l3 = "+ l3);
		System.out.println("l1==l2 "+(l1==l2));
		System.out.println("l1==l3 "+(l1==l3));
		
		System.out.println("l1.equals(l2) ="+l1.equals(l2));
		System.out.println("l1.equals(l3) ="+l1.equals(l3));
		
		long x = l1; //AutoBoxing
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Java reads everthing as String and java writes everything as String
		String s = "33723473345";
		Long number = Long.parseLong(s); //similar method in all other Wrapper classes except Character.
		System.out.println("number = "+number);
		
		number = 99894654498L;
		s = number+"";
		System.out.println(s);
		
		Long i5 = 1000L;
		s=i5.toString();
		System.out.println(s);
		
		System.out.println(Long.toBinaryString(1000000));
		System.out.println(Long.toHexString(1000000));
		System.out.println(Long.toOctalString(1000000));
		
		//compare to = if 1st object is greater then the 2nd, it will return +1 if it is same it will return 0 else -1
		System.out.println(i5);
		System.out.println("i5.compareTo(1000): " + i5.compareTo(1000L));
		System.out.println("i5.compareTo(2000): " + i5.compareTo(2000L));
		System.out.println("i5.compareTo(100): " + i5.compareTo(100L));

	}

}
