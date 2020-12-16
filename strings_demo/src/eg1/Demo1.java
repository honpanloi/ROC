package eg1;

public class Demo1 {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println("s = "+s);
		
		System.out.println("s.toUpperCase() = "+s.toUpperCase());
		System.out.println("s = "+s);
		
		s = s.toUpperCase();
		System.out.println("s = "+s);
		
		System.out.println("s.length() = "+s.length());
		System.out.println("s.charAt(0) = "+s.charAt(0));
		
		System.out.println("s.equals(\"HELLO\") = " + s.equals("HELLO"));
		System.out.println("s.equals(\"HeLLO\") = "+s.equals("HeLLO"));
		
		System.out.println("s.equalsIgnoreCase(\"HELLO\") = " + s.equalsIgnoreCase("HELLO"));
		System.out.println("s.equalsIgnoreCase(\"HeLLO\") = "+s.equalsIgnoreCase("HeLLO"));
		
		System.out.println("s.contains(\"HE\") = "+s.contains("HE"));
		System.out.println("s.contains(\"LL\") = "+s.contains("LL"));
		System.out.println("s.contains(\"he\") = "+s.contains("he"));

	}

}
