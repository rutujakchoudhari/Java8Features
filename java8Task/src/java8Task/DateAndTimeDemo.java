package java8Task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeDemo {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateandtime = LocalDateTime.now();
		DateTimeFormatter dateandtimeformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		System.out.println("Date:"+ date);
		System.out.println("Time:"+time);
		System.out.println("DateTime"+dateandtime.format(dateandtimeformatter));
//		System.out.println();

	}

}
