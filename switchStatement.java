package switchStatement;

import java.util.Scanner;

public class switchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//local variables
		int total=0;
		int gradeCounter=0;
		int aCount=0;
		int bCount=0;
		int cCount=0;
		int dCount=0;
		int fCount=0;
		//end local variables
		//scanner
		Scanner input = new Scanner(System.in);
		//end scanner
		
		System.out.printf(" %s%n%s%n    %s%n     %s%n",
				"enter grades in range 0-100",
				"control D to terminate input",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z then press Enter"
				);
		
		//loop switch
		while(input.hasNext()) {
			int grade= input.nextInt();
			total +=grade;
			++gradeCounter;
			//increment appropriate letter grade
			switch(grade/10)
			{
			case 9:
			case 10:
				++aCount;
				break;
			case 8:
				++bCount;
				break;
			case 7:
				++cCount;
				break;
			case 6:
				++dCount;
				break;
            default:
				++fCount;
				break;
			}//end switch
			//end increment
		}//end while
		//end switch
		
		// display grade report
		System.out.printf("%nGrade Report:%n");
		//end display
		//if user entered at least a grade
		if (gradeCounter != 0) {
			//average
			double average = (double) total / gradeCounter;
			//end average
			// output summary of results
			 System.out.printf("Total of the %d grades entered is %d%n",
			 gradeCounter, total);
			 System.out.printf("Class average is %.2f%n", average);
			 System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
			"Number of students who received each grade:",
			 "A: ", aCount, // display number of A grades
			 "B: ", bCount, // display number of B grades
			 "C: ", cCount, // display number of C grades
			 "D: ", dCount, // display number of D grades
		     "F: ", fCount); // display number of F grades
		}//end if 
		//end if
		else // no grades were entered, so output appropriate message
			System.out.println("No grades were entered");
	}//end main

}//end class
