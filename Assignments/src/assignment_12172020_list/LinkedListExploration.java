package assignment_12172020_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExploration {

	public static void main(String[] args) {
		
		List li1 = new LinkedList();
		li1.add("hello");
		li1.add(2222);
		li1.add(true);
		li1.add(685465L);
		li1.add(234.456876D);
		li1.add(434.56f);
		
		System.out.println("li1 =" + li1);
		
		List<Integer> li2 = new LinkedList<>();
		li2.add(2222);
		li2.add(168576);
		li2.add(223542);
		li2.add(null);
		li2.add(null);
		li2.add(54765);
		li2.add(34567);
		li2.add(1634);
		li2.add(2623542);
		li2.add(null);
		li2.add(null);
		li2.add(547672345);
		li2.add(223542);
		li2.add(223542);
		li2.add(223542);
		li2.add(223542);
		
		System.out.println("li2 =" + li2);
		
		li2.add(0, 1111);
		
		System.out.println("li2 =" + li2);
		
		li2.set(0, 2351);
		
		System.out.println("li2 =" + li2);
		
		System.out.println("li2.size() = "+li2.size());
		
		System.out.println(li2.get(3));
		
		Integer i = li2.get(3);
		
		li2.remove(i);
		
		System.out.println("i = "+i+", li2 after li2.remove(i) = " + li2);
		
		while(li2.contains(i)) {
			li2.remove(i);
		}
		
		System.out.println("li2 after while(li2.remove(i)) {} = " + li2);
		
		System.out.println("\nTraversing using for loop");
		for (int j = 0; j < li2.size(); j++) {
			System.out.print(li2.get(j)+" ");
		}
		
		System.out.println("\n\nTraversing using for each loop");
		for (Integer j:li2) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		System.out.println();
		Collections.reverse(li2);
		System.out.println("li2 after Collections.reverse(li2)" + li2);
		
		Collections.shuffle(li2);
		System.out.println("\nli2 after Collections.shuffle(li2)" + li2);
		
		Collections.replaceAll(li2, null, 0);
		System.out.println("\nli2 after Collections.replaceAll(li2, null, 0)" + li2);
		
		Collections.sort(li2); //ascending but it shouldn't have null values
		System.out.println("\nli2 after Collections.sort(li2)" + li2);
		
		Collections.sort(li2, Collections.reverseOrder()); //Descending order
		System.out.println("\nli2 after Collections.sort(li2, Collections.reverseOrder())" + li2);
		
		//for binarySearch collection should and must be sorted in ascending order
		Collections.sort(li2);
		
		System.out.println("li2 after Collections.sort(li2); for doing binarySearch" + li2);
		System.out.println("Collections.binarySearch(li2, 1634) = "+Collections.binarySearch(li2, 1634));
		System.out.println("Collections.binarySearch(li2, 2623542) = "+Collections.binarySearch(li2, 2623542));
		
		List<Integer> li3 = new ArrayList<>(li2);
		System.out.println("li3"+li3);
		
		li3.addAll(li3);
		System.out.println("li3"+li3);
		
		li3.add(100);
		li3.add(300);
		li3.add(600);
		li3.add(99);
		System.out.println("li3"+li3);
		
		System.out.println("li2"+li2);
		//li3.retainAll(li2);
		//System.out.println("li3 after li3.retainAll(li2)"+li3);
		
		li3.removeAll(li2);
		System.out.println("li3 after li3.removeAll(li2); = "+li3);

	}

}
