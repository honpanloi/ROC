package assignment_12162020_arrays;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		
		int ar[]= {12,33,11,2,344,11,12,11,22,11,11,23,11,44,11,22,950,121,989,11211,222222};
		System.out.println("Array elements are: ");
		System.out.println(Arrays.toString(ar));

		//Print the array in reverse order
		System.out.println();
		printArrayBackward(ar);
		
		//Delete specific element from an array
		System.out.println();
		deleteAnElementFormAnArray(ar,950);
		deleteAnElementFormAnArray(ar,12);
		
		//Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
		System.out.println();
		separateEvenAndOddNumbers(ar);
		
		//Find the sum of all even and odd numbers separately and print the max out of it.(max of sum of even vs odd)
		System.out.println();
		System.out.println("The sum of all even numbers: ");
		System.out.println(sumAllEvenNumber(ar));
		
		
		System.out.println("The sum of all odd numbers: ");
		System.out.println(sumAllOddNumber(ar));
		
		if(sumAllEvenNumber(ar)>sumAllOddNumber(ar)) {
			System.out.println("The sum of even number ("+sumAllEvenNumber(ar)+") is bigger");
		}else {
			System.out.println("The sum of odd number ("+sumAllOddNumber(ar)+") is bigger");
		}
		
		
		//Find the minimum and the maximum element in an array
		System.out.println();
		findTheMaxAndMin(ar);
		
		//Find all Palindrome numbers in an array
		System.out.println();
		findAllPalindromeNum(ar);
	}
	
	public static void printArrayBackward(int[] Input) {
		
		System.out.println("Printing the elements in the array backward:");
		for (int i = Input.length-1; i >= 0 ; i--) {
			System.out.print(Input[i]+" ");
		}
	}
	
	public static void deleteAnElementFormAnArray(int[] input, int target) {
		
		System.out.println("Deleting "+target+" from "+Arrays.toString(input)+"...");
		
		int targetIndex = 0;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]==target) {
				targetIndex = i;
				break;
			}
		}
		
		for (int i = targetIndex; i < input.length-1; i++) {
			input[i] = input[i+1];
		}
		
		input[input.length-1] = 0;
				
		System.out.println(target+" at the position "+(targetIndex+1)+" is deleted");
		System.out.println("The new array is: \n"+ Arrays.toString(input));
	}
	
	public static void separateEvenAndOddNumbers(int[] input) {
		
		StringBuffer evenSb = new StringBuffer();
		StringBuffer oddSb = new StringBuffer();
				
		for (int i = 0; i < input.length; i++) {
			if(input[i]%2 == 0 && input[i] != 0) {
				evenSb.append(input[i]+" ");
			}
			if(input[i]%2 == 1 && input[i] != 0) {
				oddSb.append(input[i]+" ");
			}
		}
		
		String[] evenNum = evenSb.toString().split(" ");
		String[] oddNum = oddSb.toString().split(" ");
		
		
		System.out.println("The even numbers are:");
		System.out.println(Arrays.toString(evenNum));
		
		System.out.println("The even numbers are:");
		System.out.println(Arrays.toString(oddNum));
		
	}
	
	public static int sumAllEvenNumber(int[] input) {
		
		int result = 0;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]%2 == 0 && input[i] != 0) {
				result+=input[i];
			}
		}
		
		return result;
	}
	
	public static int sumAllOddNumber(int[] input) {
		
		int result = 0;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]%2 == 1 && input[i] != 0) {
				result+=input[i];
			}
		}
		
		return result;
	}
	
	public static void findTheMaxAndMin(int[] input) {
		
		Arrays.sort(input);
		
		System.out.println("The minimun munmber is: " + input[0]);
		System.out.println("The maximun munmber is: " + input[input.length-1]);
		
	}
	
	public static void findAllPalindromeNum(int[] input) {
			
		String s = "HI";
		
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < input.length; i++) {
			StringBuffer sbTester = new StringBuffer(Integer.toString(input[i]));
			if(sbTester.length() >= 3 && sbTester.length()%2 == 1 && sbTester.toString().equals(sbTester.reverse().toString())) {
				result.append(sbTester+" ");
			}
		}
		
		System.out.println("The array has following Palindromes");
		System.out.println(result);
	}

}
