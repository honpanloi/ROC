package assignment_12162020_stringBuffer;

import java.util.Arrays;

public class LastLetterToUpper {

	public static void main(String[] args) {
		
		String s="hello hi good evening how are you doing today";
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		
		System.out.println(Arrays.toString(ar));
		
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i].substring(0, ar[i].length()-1)).append(Character.toUpperCase((ar[i].charAt(ar[i].length()-1)))).append(" ");
		}
		
		System.out.println(sb.toString());

	}

}
