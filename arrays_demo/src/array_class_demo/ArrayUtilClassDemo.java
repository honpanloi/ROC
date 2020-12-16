package array_class_demo;

import java.util.Arrays;

public class ArrayUtilClassDemo {

	public static void main(String[] args) {
		int ar[] = {12,33,11,2,344,11,12,11,22,11,23,11,44,11,22,11};
		System.out.println("Array elements are: ");
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		
		System.out.println("After sorting");
		System.out.println(Arrays.toString(ar));
		
		int ar1[] = Arrays.copyOf(ar, ar.length+10);
		System.out.println(Arrays.toString(ar1));
		
		int ar2[] = new int[10];
		Arrays.fill(ar2, 999);
		
		System.out.println(Arrays.toString(ar2));

	}

}
