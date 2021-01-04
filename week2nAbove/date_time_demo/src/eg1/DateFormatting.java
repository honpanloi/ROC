package eg1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		Date d = new Date(); 
		System.out.println(d);
		/*
		 * dd - date in 2 digits
		 * MM - month in 2 digits MMM - short name of month MMM - full
		 * yy - last 2 digits of year yyyy - year in full
		 * EEE = day in shortname, EEEE full day name
		 * mm = minutes
		 * ss - seconds
		 * HH - 24 hour
		 * hh - 12 hour
		 * z/Z - time zone
		 * a = am/pm
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy EEEE z Z 	hh:mm:ss a");
		System.out.println("formatted date: "+sdf.format(d));
	}

}
