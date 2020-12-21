package assignment_12172020_inheritance;

public class Employee extends Person{
	
	private String designation;
	private double salary;
	private Project project;
	private Address permanetAddress;
	private Address presentAddress;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String designation, double salary, Project project) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
		this.project = project;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		
	}
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Address getPermanetAddress() {
		return permanetAddress;
	}

	public void setPermanetAddress(Address permanetAddress) {
		this.permanetAddress = permanetAddress;
	}

	public Address getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	@Override
	public String toString() {
		return super.toString()+" Employee [designation = "+designation+", salary = "+salary+", project = "+project+"]";
	}
	
	

}
