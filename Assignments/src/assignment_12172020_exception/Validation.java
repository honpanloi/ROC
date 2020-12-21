package assignment_12172020_exception;

public class Validation {
	
	public boolean isValidDL(String dlNumber) throws DriverLicenseException{
		if(!dlNumber.matches("[a-zA-Z]{1}[0-9]{3}-[0-9]{4}-[0-9]{4}")){
			throw new DriverLicenseException("Entered driver license number is invalid");
		}
		return true;
	}
	
	public boolean isValidPassport(String ppNumber) throws PassportException{
		if(!ppNumber.matches("^(?!^0+$)[a-zA-Z0-9]{3,20}")){
			throw new PassportException("Entered passport number is invalid");
		}
		
		return true;
	}

}
