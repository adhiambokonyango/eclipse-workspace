package date;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object
		Date myDate = new Date(0, 0, 0);
		//end object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//enter month
		System.out.println("enter month: ");
		int month = input.nextInt();
		myDate.setMonth(month);
		//month entered
		//enter date
		System.out.println("enter date: ");
		int date = input.nextInt();
		myDate.setDate(date);
		//date entered
		//enter year
		System.out.println("enter year: ");
		int year = input.nextInt();
		myDate.setYear(year);
		//year entered
		
		//call displayDate method
		myDate.displayDate(month, date, year);
		// displayDate method called
		
		
		
	}//end main
}//end class
