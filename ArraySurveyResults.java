package arraySurveyResults;

import java.security.SecureRandom;

public class ArraySurveyResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom randomNumbers = new SecureRandom();
		
		int[] responses = {1,2,3,4,5,1,2,3,4,5,3,2,1,4,5,3,1,1,4,5};
		int[] frequency = new int[6];
		
		//for each answer . select responses' element 
		//and use that value as frequency index to determine element to inrease
		for (int answer = 0; answer < responses.length; answer++)
		{
			++frequency[responses[answer]];
		}
		
		System.out.printf("%s%10s%n", "rating", "frequency");
		
		for (int rating  = 1; rating < frequency.length; rating++)
			System.out.printf("%6d%10d%n", rating,frequency[rating]);
		
		
	}//end main

}//end class
