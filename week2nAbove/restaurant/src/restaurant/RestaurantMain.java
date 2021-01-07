package restaurant;

public class RestaurantMain {

	public static void main(String[] args) {
		
		Person p = new Person();
		Employee e = new Employee();
		
		Person p2 = e;
		
		enterRestaurant(e);
		enterRestaurant(p);
		enterRestaurant(p2);
		
		

	}
	
	public static void enterRestaurant(Person p) {
		System.out.println("this is a person");
	}
	
	public static void enterRestaurant(Employee e) {
		System.out.println("this is an employee");
	}
	
	class Money{
		
	}

}
