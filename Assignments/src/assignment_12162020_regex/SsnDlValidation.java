package assignment_12162020_regex;

public class SsnDlValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ssn = "111-11-1111";
		ssnValidation(ssn);
		
		ssn = "11-111-1111";
		ssnValidation(ssn);
		
		ssn = "111111-1111";
		ssnValidation(ssn);
		
		String dl = "A111-3334-4444";
		dlValidation(dl);
		
		dl = "5111-3334-4444";
		dlValidation(dl);
		
		dl = "b111-3334-444v";
		dlValidation(dl);
		

	}
	
	public static void ssnValidation(String input) {
		
		if(input.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("Valid SSN");
		}else {
			System.out.println("Invalid SSN");
		}
	}
	
	public static void dlValidation(String input) {
		
		if(input.matches("[a-zA-Z]{1}[0-9]{3}-[0-9]{4}-[0-9]{4}")) {
			System.out.println("Valid DL");
		}else {
			System.out.println("Invalid DL");
		}
	}

}
