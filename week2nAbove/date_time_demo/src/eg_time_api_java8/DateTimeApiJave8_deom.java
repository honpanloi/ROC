package eg_time_api_java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApiJave8_deom {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println("ld = "+ld);
		System.out.println(ld.isLeapYear());
		ld =ld.plusMonths(1);
		System.out.println("ld = "+ld);
		System.out.println(ld.isLeapYear());
		
		String s = "10.02.2000";
		LocalDate dob = LocalDate.parse(s,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println("dob = "+dob);
		
		LocalDate now = LocalDate.now();
		System.out.println("now = "+now);
		Period p = Period.between(dob, now);
		
		System.out.println("You are "+p.getYears()+" year/s, and "+p.getMonths()+" month/s and, "+p.getDays()+" day/s old");

		System.out.println("you are "+ChronoUnit.DAYS.between(dob, now)+ " day/s old");
		System.out.println("you are "+ChronoUnit.MONTHS.between(dob, now)+ " month/s old");
		System.out.println("you are "+ChronoUnit.YEARS.between(dob, now)+ " yesr/s old");
	}

}
//LocalTime
//Local