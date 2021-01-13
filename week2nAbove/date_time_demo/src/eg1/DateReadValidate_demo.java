package eg1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateReadValidate_demo {

	public static void main(String[] args) {
		
		String s = "13.04.1990";
		if(s.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}")) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
			sdf.setLenient(false);
			Date dob = null;
			try {
				dob = sdf.parse(s);
				System.out.println("dob validated with dob = "+dob);
			} catch (ParseException e) {
				System.out.println("Invalid date");
			}
		}else {
			System.out.println("Invalid date");
		}
		

	}

}
