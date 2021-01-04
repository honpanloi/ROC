package eg1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Banana","Orange","Pineapple","Mango","Grapes","Muskmelon","Kiwi","Strawberry");
		
		List<String> fruitsResult = fruits.stream().filter(f->f.length()>5).map(f->f.toUpperCase()).sorted().collect(Collectors.toList());
		
		System.out.println("FruitsResult = "+fruitsResult.toString());

	}

}
