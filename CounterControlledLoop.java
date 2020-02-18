package counterControlledLoop;

import java.util.Scanner;

public class CounterControlledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in );
		//end scanner
		
		//initialize
		int total = 0;
		int gradeCounter = 1;
		//end initialize
		
		//while
		while(gradeCounter <= 10)
		{
			System.out.print("enter grade: ");
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter+=1;
		}
		//end while
		
		//average
		int average = total/10;
		//end average
		
		//display 
		System.out.printf("%n total is %d", total);
		System.out.printf("%naverage is %d", average);
		//end display
	}//end main

}//end class
