package eg1;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "madam";
		StringBuffer sb = new StringBuffer(s);
		
		sb.reverse();
		
		String s1 = sb.toString();
		
		if(s.equals(s1)) {
			System.out.println("Yes, it is Palindrome");
		}else {
			System.out.println("No, it is not Palindrome");
		}
		
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("Yes, it is Palindrome");
		}else {
			System.out.println("No, it is not Palindrome");
		}

	}

}
