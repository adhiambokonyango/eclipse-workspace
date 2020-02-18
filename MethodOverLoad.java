package methodOverLoad;

public class MethodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.printf("squareOfInteger 7 is %d%n", square(7));
System.out.printf("squareOfDouble 7.5 is %f%n", square(7.5));

	}//end main
	
	public static int square (int intValue)
	{
		System.out.printf("%n called square with int argument : %d%n", intValue);
return intValue * intValue; 
	}// end method
	
	public static double square (double doubleValue)
	{
		System.out.printf("%n called square with double argument : %f%n", doubleValue);
return doubleValue * doubleValue; 
	}// end method

}//end class
