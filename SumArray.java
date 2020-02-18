package sumArray;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {45,12,47,63,52,89,14,78};
		int total = 0;
		
		//add each elements value to total
		for (int counter = 0; counter < array.length; counter++)
			total += array[counter];
		
		System.out.printf("total of array elements is : %d%n", total);
		
		
	}//end main

}//end class
