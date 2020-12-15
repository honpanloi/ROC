package assignment_12152020;
import java.util.Scanner;

public class Palindrome_checker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String input = scanner.nextLine();
		
		//done using scanner
		scanner.close();
		
		//if the length of the word is a even number, it cannot be a palindrome
		if(input.length() % 2 == 0) {
			System.out.println("This cannot be a palindrome.");
		}else {
			if(isPalindrome(input)) {
				System.out.println("This is a palindrome.");
			}else System.out.println("This is not a palindrome.");
		}
		
		

	}
	
	public static boolean isPalindrome(String input) {
		//this is default true according to how this method works
		boolean result = true;
		
		//make a char array that is half the length of the original string
		char[] firstHalf = new char[input.length()/2];
		
		//Assign chars into the new char array and check if each char is equal to the opposite side of the original string
		for (int i = 0; i < firstHalf.length; i++) {
			
			firstHalf[i] = input.charAt(i);
			
			//if it's not equal, return false and break out from the loop. else continue
			if(firstHalf[i] != input.charAt(input.length()-1-i)) {
				return false;
			}
		}
		
		return result;
	}

}
