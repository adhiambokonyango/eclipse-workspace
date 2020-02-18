package randomInteger;

import java.security.SecureRandom;

public class RandomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//secure random object
		SecureRandom randomNumbers = new SecureRandom();
		//end secure random object
		
		//loop 20 times
		for(int counter = 1; counter <= 20; counter++)
		{
			int face = 1 + randomNumbers.nextInt(6);
			System.out.printf("%d ", face); //display generated value
			//if counter divisible by five start new line
			if (counter % 5 == 0)
				System.out.println();
		}
		//end loop
		
	}//end main

}//end class
