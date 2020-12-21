package assignment_12172020_exception;

public class Main {

	public static void main(String[] args) {
		
		String dl = "l000-4444-8888";
		
		Validation v = new Validation();
		
		try {
			if(v.isValidDL(dl)) {
				System.out.println("Driver license is valid");
			}
		}catch(DriverLicenseException e) {
			System.out.println(e.getMessage());
		}
		
		String dl1 = "0i00-5555-7666";
		
		try {
			if(v.isValidDL(dl1)) {
				System.out.println("Driver license is valid");
			}
		}catch(DriverLicenseException e) {
			System.out.println(e.getMessage());
		}
		
		String pp = "@15486544";
		
		try {
			if(v.isValidPassport(pp)) {
				System.out.println("Passport is valid");
			}
		}catch(PassportException e) {
			System.out.println(e.getMessage());
		}
		
		String pp1 = "A15486544";
		
		try {
			if(v.isValidPassport(pp1)) {
				System.out.println("Passport is valid");
			}
		}catch(PassportException e) {
			System.out.println(e.getMessage());
		}

	}

}
