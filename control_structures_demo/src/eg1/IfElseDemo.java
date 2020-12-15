package eg1;

public class IfElseDemo {

	public static void main(String[] args) {
		int x = 11;
		
		if(x == 10) {
			System.out.println("x is 10");
		}
		else {
			System.out.println("x is not 10");
		}
		
		if(x == 10 || x == 9) {
			System.out.println("x is 10 or 9");
		}
		else {
			System.out.println("x is neither 10 or 9");
		}
		
		int score = 98;
		if(score >= 90) {
			System.out.println("It's top class");
		}
		else if(score < 90 && score >= 60) {
			System.out.println("It's second class");
		}
		else if(score < 60 && score >= 30) {
			System.out.println("It's third class");
		}
		else {
			System.out.println("It's last class");
		}

	}

}
