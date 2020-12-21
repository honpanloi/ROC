package eg1;

public abstract class EMS {
	
	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void calculateEmployeeLeaves();
	public abstract void searchEmployee();
	public abstract void removeEmployee();
	
	public void commonEmployeeBenifit() {
		System.out.println("common employee benifit");
	}

}
