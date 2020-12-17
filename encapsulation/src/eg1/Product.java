package eg1;

public class Product {
	
	//1st step of encapsulation: make your fields private
	private int id;
	private String name;
	private double price;
	
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Product() {
		
	}
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void PrintProduct() {
		System.out.println("Id = "+id);
		System.out.println("name = "+name);
		System.out.println("Price = $"+price);
	}

}
