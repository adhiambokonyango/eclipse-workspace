package initializeArray;

public class InitializeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] array = new int[10];
	
	System.out.printf("%s%8s%n","index","value" );
	
	//output
	for (int counter = 0; counter < array.length; counter++)
		System.out.printf("%5d%8d%n", counter, array[counter]);
	//end output
		
	}//end main

}//end class
