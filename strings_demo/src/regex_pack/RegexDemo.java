package regex_pack;

public class RegexDemo {

	public static void main(String[] args) {
		/*
		 * Reg-ex Regular Expression.
		 * Short hand of writing an expression using some wild cards, which would match the pattern and give the results
		 * [] - to write and expression
		 * {} - represents length
		 * ^ - represents not
		 * [0-9]{5} - any digits of length 5
		 * [a-zA-Z]{6} - any word of length 6
		 * [a-zA-Z0-9]{2,6} - any alphanumeric of min length 2 max length 6
		 * [A-Z]{1,} - min 1 uppercase letter and max can be any
		 * [^a-z] - apart from lower lowercase letters anything else is accepted
		 */
		
		String s = "gas ASdjh hd $78s 123 l ()";
		System.out.println(s.toString());
		System.out.println("The length of the string is: "+s.length());
		System.out.println(s.replaceAll("[a-zA-Z]", ""));
		System.out.println("The length of the new string is: "+s.replaceAll("[a-zA-Z]", "").length());
		
		
		String ex = "";

	}

}
