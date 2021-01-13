import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTester {

	public static void main(String[] args) {
		
		LocalTime localtime = LocalTime.now();
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localtime);
		System.out.println(localDate);
		
		DateTimeFormatter hourFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		
		String printedTime = hourFormat.format(localtime);
		String printedDate = DateFormat.format(localDate);
		System.out.println( printedTime);
		
		
		

	}

}
