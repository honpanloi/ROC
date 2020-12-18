package eg1;

import java.time.format.TextStyle;
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
		hs.add("bee");
		hs.add("jme");
		hs.add("hello");
		
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
		
		Set<String> ths = new TreeSet<>(Collections.reverseOrder());
		
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
		
		System.out.println("ths = "+ths);
		
		System.out.println("\nTraversing using for-each loop");
		for(String s:ths) {
			System.out.println(s);
		}

	}

}
