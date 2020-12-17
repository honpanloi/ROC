package eg1;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private long contact;
	private char gender;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Employee() {
		
	}
	
	public Employee(String name, int age, long contact, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.gender = gender;
	}
	
	public void PrintEmployee() {
		System.out.println("Hello "+name);
		System.out.println("Age: "+age);
		System.out.println("Contact: "+contact);
		System.out.println("Gender: "+gender);
	}
	
	public String toString() {
		return "Employee [id="+id+", name="+name+", contact="+contact+", age="+age+", gender="+gender+"]";
	}
	
}
