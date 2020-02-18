package arrayInitializerList;

public class ArrayInitializerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {45,12,45,13,47,86}; //array initializer list
		//column headings
		System.out.printf("%s%8s%n", "index","value");
		
		//output each array element values
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
		
		
	}//end main

}//end class
