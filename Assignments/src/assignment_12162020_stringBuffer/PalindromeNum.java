package assignment_12162020_stringBuffer;

public class PalindromeNum {

	public static void main(String[] args) {
		
		int min = 1000;
		int max = 9999;
		
		for (int i = min; i <= max; i++) {
			
			StringBuffer sb = new StringBuffer(Integer.toString(i));
			
			if(sb.toString().equals(sb.reverse().toString())) {
				System.out.println(i);
			}
		}

	}

}
