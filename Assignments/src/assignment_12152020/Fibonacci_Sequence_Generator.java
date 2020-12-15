package assignment_12152020;
import java.util.Scanner;

public class Fibonacci_Sequence_Generator {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the 1st number of your fibonacci sequence");
		String fnumInput = scanner.nextLine();
		
		System.out.println("Enter the 2st number of your fibonacci sequence");
		String snumInput = scanner.nextLine();
		
		System.out.println("How many number do you want the fibonacci sequence to have?");
		String input = scanner.nextLine();
		
		scanner.close();
		
		//parse all inputs into ints
		int fNum = Integer.parseInt(fnumInput);
		int sNum = Integer.parseInt(snumInput);
		int length = Integer.parseInt(input);
		
		//create a new array and store the first 2 number into the first 2 slots
		int[] fibSeq = new int[length];
		
		//in order make a fibonacci sequence, smaller number has to go first
		if(fNum < sNum) {
			fibSeq[0] = fNum;
			fibSeq[1] = sNum;
		}else {
			fibSeq[0] = sNum;
			fibSeq[1] = fNum;
		}
		
		//Since we've already stored the first 2 values, we would only do extra work if the user wants fibonacci sequence that is longer than 2 numbers
		if(length>2) {
			
			//since 0 and 1 is dealt with, we would start the for loop with i = 2
			for (int i = 2; i < length; i++) {
				//the next number will be the sum of the 2 previous numbers
				fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];
			}
		}
		
		//print all the numbers
		for (int i = 0; i < fibSeq.length; i++) {
			if(i == fibSeq.length-1) {
				System.out.print(fibSeq[i]);
			}else {
				System.out.print(fibSeq[i] + ", ");
			}
			
		}

	}

}
