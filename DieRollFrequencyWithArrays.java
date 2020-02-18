package dieRollFrequencyWithArrays;

import java.security.SecureRandom;

public class DieRollFrequencyWithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom randomNumbers = new SecureRandom();
		
		int[] frequency = new int[7]; //array of frequency counters
		
		//roll die 6million times , use die value as frequency index
		for (int roll = 1; roll <= 6000000; roll++)
			++frequency[1+randomNumbers.nextInt(6)];
		
		System.out.printf("%s%10s%n", "face", "frequency");
		
		//output element values
		for (int face = 1; face < frequency.length; face++)
			System.out.printf("%4d%10d%n", face, frequency[face]);
		
		
	}//end main

}//end class
