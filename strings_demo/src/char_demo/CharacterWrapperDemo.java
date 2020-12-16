package char_demo;

public class CharacterWrapperDemo {

	public static void main(String[] args) {
		String s = "gas ASdjh hd $78s 123 l ()";
		
		int alphas = 0,upper = 0, lower = 0, digit = 0, alphanum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alphas++;
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				upper++;
			}
		}
		
		System.out.println(alphas);
		System.out.println(upper);
	}

}
