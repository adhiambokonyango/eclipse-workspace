package arrayHistogram;

public class ArrayHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.println("Grade Distribution:");
		
		//output 00_09/ 10_19
		for (int counter = 0; counter< array.length; counter++)
		{
			if(counter == 10)
				System.out.printf("%5d: ", 100);
				else
					System.out.printf("%02d-%02d: ",
							counter * 10, counter * 10 + 9);
			
			// print bar
			for (int stars = 0; stars < array[counter]; stars++)
			System.out.print("*");
			
			System.out.println();
		}
	}//end main

}//end class
