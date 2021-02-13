package examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExamplesOfDateAndTime3 {

	public static void main(String[] args) {
//		example1();
		
//		example2();
		
		example3();
	}

	public static void example1() {
		LocalDate myDate = LocalDate.now(); // Create a date object
	    System.out.println(myDate);
	    
	    LocalTime myTime = LocalTime.now();
	    System.out.println(myTime);
	    
	    LocalDateTime myDateAndTime = LocalDateTime.now();
	    System.out.println(myDateAndTime);
	    
	}
	
//	example 2
	public static void example2() {
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}
	
//	example 3
	public static void example3() {
		LocalDateTime today =  LocalDateTime.now();     //Today
		LocalDateTime tomorrow = today.plusDays(1);     //Plus 1 day
		LocalDateTime yesterday = today.minusDays(1);   //Minus 1 day
		 
		System.out.println(today);          
		System.out.println(tomorrow);       
		System.out.println(yesterday);      
		 
		System.out.println("------------------------");
		LocalDateTime sameDayNextMonth = today.plusMonths(1);       
		LocalDateTime sameDayLastMonth = today.minusMonths(1);      
		 
		LocalDateTime sameDayNextYear = today.plusYears(1);     
		LocalDateTime sameDayLastYear = today.minusYears(1);  

		System.out.println(sameDayNextMonth);
		System.out.println(sameDayLastMonth);
		System.out.println(sameDayNextYear);
		System.out.println(sameDayLastYear);
	}
	
}
