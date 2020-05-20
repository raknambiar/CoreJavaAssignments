package Sdet_Java_Task2;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Q7 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String string = "April 23, 2020";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		LocalDate date = LocalDate.parse(string, formatter);
		System.out.println(date);
	
	}

}


