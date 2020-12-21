package assignment_12172020_inheritance;

public class Address {

	private int aid;
	private String streetName;
	private String cityName;
	private int zip;
	
	public Address() {
		
	}

	public Address(int aid, String streetName, String cityName, int zip) {
		super();
		this.aid = aid;
		this.streetName = streetName;
		this.cityName = cityName;
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return aid+" "+streetName+", "+cityName+", "+zip;
	}
	
}
