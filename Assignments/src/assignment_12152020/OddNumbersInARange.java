package assignment_12152020;
import java.util.Scanner;

public class OddNumbersInARange {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		String input1 = scanner.nextLine();
		
		System.out.println("Enter the 2nd number");
		String input2 = scanner.nextLine();
		
		//close the scanner since we gather everything we need
		scanner.close();
		
		//cast the inputs into ints
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		
		//the following situations will make it impossible to have any number between the inputs
		if(a == b || a == b+1 || a == b-1 || b == a+1 || b == a-1) {
			System.out.println("There is no odd numbers between these 2 numbers");
		}
		
		//after checking the a larger than b in case the user put a larger number first
		else if(a > b) {
			//if the two numbers are both odd number and only 1 number in between, it cannot be an odd number
			if(a%2 == 1 && b%2 == 1 && a - b ==2) {
				System.out.println("There is no odd numbers between these 2 numbers");
			}
			
			//check and print every number in between those 2
			else {
				System.out.println("The odd number(s) between these 2 numbers: "); 
				for(int i = b + 1; i < a; i++) {
					if(i%2 == 1) {
						System.out.println(i);
					}
				}
			}
			
		}
		
		//if the user put a smaller number first as it should be
		else if(a < b) {
			
			//again, if the two numbers are both odd number and only 1 number in between, it cannot be an odd number
			if(a%2 == 1 && b%2 == 1 && b - a ==2) {
				System.out.println("There is no odd numbers between these 2 numbers");
			}
			
			//check and print every number in between those 2
			else {
				System.out.println("The odd number(s) between these 2 numbers: "); 
				for(int i = a + 1; i < b; i++) {
					if(i%2 == 1) {
						System.out.println(i);
					}
				}
			}
			
		}
		
		
		

	}

}
