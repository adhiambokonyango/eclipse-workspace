package staticMethod;

import java.util.Scanner;

public class StaticMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //object
				StaticMethod firstAccount = new StaticMethod(null, 0);
				StaticMethod secondAccount = new StaticMethod(null, 0);
				//end object
				
				//scanner
				@SuppressWarnings("resource")
				Scanner input = new Scanner (System.in);
				//end scanner
				
				//input section
				//first account- set name
				System.out.println("enter client name: ");
				String theName = input.nextLine();
				firstAccount.setName(theName);
				//end first account-set name
				//second account - set name
				System.out.println("enter second clients name: ");
				String theName1 = input.nextLine();
				secondAccount.setName(theName1);
				//end second account - set name
				
				//first account set balance
				System.out.printf("enter deposit for %s: ",firstAccount.getName());
				double balance = input.nextDouble();
				firstAccount.setBalance(balance);
				//end first account set balance
				//second account set balance
				System.out.printf("enter deposit for %s: ",secondAccount.getName());
				double balance1 = input.nextDouble();
				secondAccount.setBalance(balance1);
				// end second account set balance
				//end input section
				
				//call display 
				StaticMethodTest.displayMethod(firstAccount);
				StaticMethodTest.displayMethod(secondAccount);
				//end call display
				
			}//end main
	
	
	//displayMethod
		public static void displayMethod(StaticMethod firstAccount)
		{
		System.out.printf("%n%s:%.2f",firstAccount.getName(),firstAccount.getBalance());
		}
		public static void displayMethod1(StaticMethod secondAccount)
		{
		System.out.printf("%n%s:%.2f",secondAccount.getName(),secondAccount.getBalance() );
		}
		//end displayMethod

}//end class




