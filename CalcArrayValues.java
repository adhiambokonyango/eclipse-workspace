package calcArrayValues;

public class CalcArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int ARRAY_LENGTH = 10; //constant array size
		int[] array = new int [ARRAY_LENGTH]; // array object
		
		//calculate value for each array element
		for (int counter = 0; counter < array.length; counter++)
			array[counter] = 2 +2 * counter;
		
		System.out.printf("%s%8s%n", "index", "value"); //column headings
		
		//output values
		for (int counter = 0; counter < array.length; counter ++)
			System.out.printf("%5d%8d%n", counter,array[counter]);
		
	}//end main

}// end class
