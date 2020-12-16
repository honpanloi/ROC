package eg2;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(100, "Disesh");
		System.out.println("Printing e1");
		e1.PrintEmployee();

		Employee e2 = new Employee(101, "Maya");
		System.out.println("\nPrinting e2");
		e2.PrintEmployee();
		
		Employee e3 = new Employee(102, "John", 1234563l, "Chicago");
		System.out.println("\nPrinting e3");
		e3.PrintEmployee();
	}

}
