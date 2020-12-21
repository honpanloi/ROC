package assignment_12172020_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayTasksWithLinkedList {

	public static void main(String[] args) {

		List<Integer> li = new LinkedList<Integer>();
		
		int ar[]= {12,33,11,2,344,11,12,11,22,11,11,23,11,44,11,22,950,121,989,11211,222222};
		
		for (int i = 0; i < ar.length; i++) {
			li.add((Integer)ar[i]);
		}
		
		System.out.println("li after adding all elements from ar[] = "+li);
		
		//Print the linked list in reverse order
		Collections.reverse(li);
		System.out.println("\nli in reverse order" +li);
		
		//Delete element from an linked list
		li.remove(0);
		li.remove(0);
		System.out.println("\nli after li.remove(0) twice" + li);
		
		Integer target = 11;
		System.out.println("Target = " + target);
		while(li.contains(target)) {
			li.remove(target);
		}
		
		System.out.println("li after li.remove(target) while li.contains(target)" + li);
		
		//Find all the even numbers and put it in a new list and also find all odd numbers and put it in another list
		List<Integer> liEven = new LinkedList<>();
		List<Integer> liOdd = new LinkedList<>();
		for(Integer i:li) {
			if(i%2 == 0) {
				liEven.add(i);
			}else {
				liOdd.add(i);
			}
		}
		
		System.out.println("\nAll even numbers in li:");
		System.out.println(liEven);
		System.out.println("All odd numbers in li:");
		System.out.println(liOdd);
		
		//Find the sum of all even and odd numbers separately and print the max out of it.(max of sum of even vs odd)
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		for(Integer i: liEven) {
			sumOfEven += (int)i;
		}
		
		for(Integer i: liOdd) {
			sumOfOdd += (int)i;
		}
		
		if(sumOfEven>sumOfOdd) {
			System.out.println("The sum of even number is bigger, and the result = " + sumOfEven);
		}else {
			System.out.println("The sum of odd number is bigger, and the result = " + sumOfOdd);
		}
		
		//Find the minimum and the maximum element in a list
		Collections.sort(li);
		System.out.println("The minimum number of li = " + li.get(0));
		System.out.println("The maximum number of li = " + li.get(li.size()-1));
		
		//Find all Palindrome numbers in a list
		System.out.println("li before checking Palindromes = "+li);
		
		List<StringBuffer> lis = new LinkedList<StringBuffer>();
		
		for(Integer i:li) {
			StringBuffer s = new StringBuffer("");
			s.append(i.toString());
			lis.add(s);
		}
		
		System.out.println("lis = "+lis);
		
		StringBuffer palindromes = new StringBuffer();
		
		for(StringBuffer s:lis) {
			StringBuffer checker = new StringBuffer(s);
			if(checker.reverse().toString().equals(s.toString())) {
				palindromes.append(s).append(" ");
			}
			
		}
		
		System.out.print("All Palindromes in li = " + palindromes);
		
	

	}

}
