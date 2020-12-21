package eg1;

public class EMSMain {

	public static void main(String[] args) {
		
		System.out.println("Accessing EMS via RevatureEMS");
		
		EMS revEms = new RevatureEMS();
		
		revEms.addEmployee();
		revEms.updateEmployee();
		revEms.calculateEmployeeLeaves();
		revEms.searchEmployee();
		revEms.removeEmployee();
		
		System.out.println("Accessing EMS via RevatureEMS");
		
		EMS xyzEms = new XyzEms();
		
		xyzEms.addEmployee();
		xyzEms.updateEmployee();
		xyzEms.calculateEmployeeLeaves();
		xyzEms.searchEmployee();
		xyzEms.removeEmployee();
	}

}
