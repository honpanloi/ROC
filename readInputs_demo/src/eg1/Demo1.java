package eg1;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your contact");
		long contact = sc.nextLong();
		System.out.println("Enter your Gneder");
		char gender = sc.next().charAt(0);
		
		Employee e1 = new Employee(name,age,contact,gender);
		e1.setId(100);
		e1.PrintEmployee();
		
		
		System.out.println(e1.toString());
	}

}
