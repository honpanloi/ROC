package eg1;

import java.util.Scanner;

public class Demo2ObjectRead {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Employee e2 = new Employee();
		System.out.println("Enter your name");
		String name = sc.nextLine();
		e2.setName(name);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		e2.setAge(age);
		System.out.println("Enter contact");
		long contact = sc.nextLong();
		e2.setContact(contact);
		System.out.println("Enter gender");
		char gender = sc.next().charAt(0);
		e2.setGender(gender);
		
		e2.PrintEmployee();
		
		//use constructor to initialize an employee
		Employee e3 = new Employee(name,age,contact,gender);
		e3.PrintEmployee();
		

	}

}
