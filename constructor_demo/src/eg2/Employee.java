package eg2;

public class Employee {
	
	private int id;
	private String name;
	private long contact;
	private String city;
	
	public Employee() {
		//this is how a default constructor looks like
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, long contact, String city) {
		this(id, name); //constructor chaining which your can only chain 1 constructor and in first line only
		this.contact = contact;
		this.city = city;
	}
	
	public void PrintEmployee() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
		System.out.println("City : " + city);
	}

}
