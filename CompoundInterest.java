package compoundInterest;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//local variable
		double amount;
		double principal =1000;
		double rate = 0.05;
	//end local variable
		
		//display headers
		System.out.printf("%s%20s%n", "year", "Amount on deposit");
		//end display headers
		
		//calculate amount on deposit for each year
		for (int year = 1;  year <= 10; ++year) {
			amount = principal * Math.pow(1.0+rate, year);
			//display year and amount
			System.out.printf("%4d  %, 20.2f%n", year,amount);
			//end display
		}//end for
		//end calculate
		
	}//end main

}//end class
