package eg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(34,15,723,63,5673,234,7455,833,44,27,233,68,45,6,2,2,2,2);
		
		System.out.println("li = "+li.toString());
		
		List<Integer> liEven = new ArrayList<>();
		
		for(Integer i:li) {
			if(i%2==0) {
				liEven.add(i);
			}
		}
		
		System.out.println("LiEven = "+liEven.toString());
		
		List<Integer> LiEvenStreams = li.stream().filter(i->(i%2==0)).collect(Collectors.toList());
		
		System.out.println("LiEvenStreams = "+LiEvenStreams);
		
		List<Integer> LiEvenStreamsDistinct = li.stream().filter(i->(i%2==0)).distinct().collect(Collectors.toList());
		
		System.out.println("LiEvenStreamsDistinct = "+LiEvenStreamsDistinct);
		
		List<Integer> LiEvenStreamsDistinctSorted = li.stream().filter(i->(i%2==0)).distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("LiEvenStreamsDistinctSorted = "+LiEvenStreamsDistinctSorted);
		
		
	}

}
