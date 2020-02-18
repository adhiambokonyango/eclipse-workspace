package sentinelIndefiniteRepetition;

import java.util.Scanner;

public class SentinelIndefiniteRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
	//end scanner
		
	//initialize
		int total=0;
		int gradeCounter= 0;
	// end initialize
	
		 
		int grade = 0;
		//while
		while (grade != -1)
		{
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			// processing
			System.out.print("enter grade or -1 to end: ");
			 grade = input.nextInt();
			//end processing
		}
		//end while
		
		if (gradeCounter != 0)
		{
			double average = (double) total / gradeCounter;
			System.out.printf("%nTotal of the %d grades entered is %d%n",
					 gradeCounter, total);
					System.out.printf("Class average is %.2f%n", average);
		}//end if
		else // no grades were entered, so output appropriate message
			System.out.println("No grades were entered");
	}//end main

}//end class
