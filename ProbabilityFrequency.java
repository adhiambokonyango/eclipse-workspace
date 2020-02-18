package probabilityFrequency;

import java.security.SecureRandom;

public class ProbabilityFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom randomNumbers = new SecureRandom();
		
		//local variables
		int frequency1 = 0;//count of 1s rolled
		int frequency2 = 0;//count of 1s rolled
		int frequency3 = 0;//count of 1s rolled
		int frequency4 = 0;//count of 1s rolled
		int frequency5 = 0;//count of 1s rolled
		int frequency6 = 0;//count of 1s rolled
		//end local variables
		
		//switch
		for(int roll = 1; roll <=6000000; roll++)
		{
			int face = 1 + randomNumbers.nextInt(6); //number from 1 to 6
			switch(face)
			{
			case 1:
				++frequency1; //increment 1 frequency counter
				break;
				
			case 2:
				++frequency2; //increment 1 frequency counter
				break;
				
			case 3:
				++frequency3; //increment 1 frequency counter
				break;
				
			case 4:
				++frequency4; //increment 1 frequency counter
				break;
				
			case 5:
				++frequency5; //increment 1 frequency counter
				break;
				
			case 6:
				++frequency6; //increment 1 frequency counter
				break;
			}
		}//end for
		//end switch
		
		System.out.println("Face\tFrequency"); //header for column
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
				frequency1, frequency2, frequency3, frequency4,
				 frequency5, frequency6 );
		
	}//end main

}//end class
