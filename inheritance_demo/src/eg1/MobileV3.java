package eg1;

public class MobileV3 extends MobileV2{
	
	public MobileV3() {
		System.out.println("V3");
	}

	public void socialApps() {
		System.out.println("Social app feature from V3");

	}
	
	@Override
	void displayMenu() {
		System.out.println("Menu in V3 updated to GRID view");

	}

}

//you cannot override static methods, constructors, final methods, and private of parent
//to perform override there should must be parent and child relationship
