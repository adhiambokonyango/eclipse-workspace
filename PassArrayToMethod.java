package passArrayToMethod;

public class PassArrayToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {45, 78, 89, 58};
System.out.printf("effects of passing references to entire array:%n"
		+ "the values of original array are : %n");

//output original array
for (int value : array)
	System.out.printf("%d", value);

modifyArray(array); //pass array reference
System.out.printf("%n%n values of modified array are:%n");

//output modified array elements
for (int value : array)
	System.out.printf("  %d", value);
System.out.printf("%n%neffect of passing array element" + "array[3] before modifyElement: %d%n", array[3]);

//modify element
modifyElement(array[3]);
System.out.printf("array[3] after modifyElement: %d%n", array[3]);
	}//end main
	
	// multiply each element of array by 2
	public static void modifyArray(int[] array2)
	{
		for(int counter = 0; counter < array2.length; counter++)
			array2[counter] *= 2;
	}

	//multiply argument by 5
	public static void modifyElement(int element)
	{
		element *= 5;
		System.out.printf("value of element in modifyElement: element");
	}
}//end class
