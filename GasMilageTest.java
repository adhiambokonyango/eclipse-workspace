package gasMilage;

import java.util.Scanner;

public class GasMilageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//end scanner

	GasMileage car = new GasMileage(0, 0);
	     
		
		int miles=0;
		int gallons = 0;
		int tripCounter= 0;
		//input section
	
		while (miles != -1) {
			System.out.println("enter miles: ");
			 miles = input.nextInt();
		    car.setMiles(miles);
		    System.out.println("enter gallons: ");
			gallons = input.nextInt();
		    car.setGallons(gallons);
		}//end while
	/*	while (tripCounter != -1) {
			 System.out.println("enter gallons: ");
				gallons = input.nextInt();
			    car.setGallons(gallons);
			   tripCounter -=  1 ;
		}//end while**/
		//end input
		
	//mPg
	if (tripCounter != 0) {
		car.milesPerGallon(miles, gallons);
	System.out.printf("miles per gallon is %.2f ",car.milesPerGallon(miles, gallons));
	}
		//end mPg
		
		
	}//end main

}//end class
