package outputArray;

public class outputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
		
		// output array1
		System.out.println("Values in array1 by row are");
		displayArray(array1); // displays array1 by row
		
		System.out.printf("%nValues in array2 by row are%n");
		displayArray(array2); // displays array2 by row
		
	}
	
public static void displayArray(int[][] array)
	{
		for (int row = 0; row < array.length; row++)
		{
			for (int column = 0; column < array.length; column++)
				System.out.printf("%d", array[row][column]);
			System.out.println();
		}	
	}

}

