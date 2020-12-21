package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		
		hs.add("hello");
		hs.add("hello");
		hs.add(null);
		hs.add(null);
		hs.add("hey");
		hs.add("hi");
		hs.add("java");
		hs.add(null);
		hs.add("jee");
		hs.add("jme");
		hs.add("spring");
		hs.add("alpha");
		hs.add("hibernate");
		hs.add("java");
		hs.add(null);
		
		
		System.out.println("hs = "+hs);
		
		Set<String> lhs = new LinkedHashSet<>();
		
		lhs.add("hello");
		lhs.add("hello");
		lhs.add(null);
		lhs.add(null);
		lhs.add("hey");
		lhs.add("hi");
		lhs.add("java");
		lhs.add(null);
		lhs.add("bee");
		lhs.add("jme");
		lhs.add("hello");
		
		System.out.println("lhs = "+lhs);
		
		Set<String> ths = new TreeSet<>(Collections.reverseOrder()); //default constructor will be in ascending order
		
		ths.add("hello");
		ths.add("hello");
		ths.add("hey");
		ths.add("hi");
		ths.add("java");
		ths.add("bee");
		ths.add("jme");
		ths.add("hello");
		
		System.out.println("ths = "+ths);
		
		System.out.println(ths.size());
		System.out.println(ths.contains("hi"));
		System.out.println(ths.contains("two"));
		ths.remove("jme");
		
		//Try addAll() removeAll() retainAll()
		Set<String> ths2 = new TreeSet<>();
		ths2.add("a");
		ths2.add("b");
		ths2.add("c");
		ths2.add("d");
		ths2.add("e");
		ths2.add("f");
		
		System.out.println(ths2);
		
		ths.addAll(ths2);
		
		System.out.println("ths after ths.addAll(ths2); = " + ths);
		
		ths.removeAll(ths2);
		System.out.println("ths after ths.removeAll(ths2); = " + ths);
		
		ths.addAll(ths2);
		
		System.out.println("ths after ths.addAll(ths2); = " + ths);
		
		ths.retainAll(ths2);
		
		System.out.println("ths after ths.retainAll(ths2); = " + ths);
		
		
		System.out.println("ths = "+ths);
		
		System.out.println("\nTraversing using for-each loop");
		for(String s:ths) {
			System.out.println(s);
		}

	}

}
