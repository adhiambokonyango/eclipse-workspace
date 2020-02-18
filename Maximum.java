package maximum;

import java.util.Scanner;


public class Maximum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner input = new Scanner(System.in);
		
		//prompt input
		System.out.print("Enter three floating point values separated by comma: ");
		double number1 = input.nextDouble();//first value
		double number2 = input.nextDouble();//second value
		double number3 = input.nextDouble();//third value
		
		//max method
		double result = maximumFind(number1, number2, number3);
		//end max method
		
		//display value
		System.out.println("maximum is : " + result);
	}//end main
	
	//static method maximum
	public static double maximumFind(double x, double y, double z)
	{
		double maximumValue = x;
		if (y > maximumValue)
			maximumValue = y;
		
		if (z > maximumValue)
			maximumValue = z;
		
		return maximumValue;
		
	}
	//end static method maximum

}//end class
