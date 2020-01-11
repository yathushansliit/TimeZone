import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import java.util.Calendar;

class TimeZone{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	int year,month,date,hour,minute,second,nanosecond;
	
	
	System.out.println("Enter the Year :- ");
	year = sc.nextInt();
	
	System.out.println("Enter the month :- ");
	month = sc.nextInt();
	
	System.out.println("Enter the date :- ");
	date = sc.nextInt();
	
	System.out.println("Enter the hour :- ");
	hour = sc.nextInt();
	
	System.out.println("Enter the minute :- ");
	minute = sc.nextInt();
	
	System.out.println("Enter the second :- ");
	second = sc.nextInt();
	
	System.out.println("Enter the nanosecond :- ");
	nanosecond = sc.nextInt();
	
	LocalDateTime localDateTime2 =
    LocalDateTime.of(year,month,date,hour,minute,second,nanosecond);
	
	System.out.println(localDateTime2);	
	
	 
	ZonedDateTime LAZonedDateTime= localDateTime2.atZone(ZoneId.of("America/Los_Angeles"));
	ZonedDateTime LADateTimeToUTC= LAZonedDateTime.withZoneSameInstant(ZoneId.of("UTC+00:00"));
	System.out.println(LADateTimeToUTC);


	

}

}