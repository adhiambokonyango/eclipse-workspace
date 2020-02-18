package scope;

public class Scope {

	//field accessible in all methods in this class
	private static int x = 1;
	//end field
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 5; //methods local variable x shadows field x

System.out.printf("local x in main is %d%n", x);

useLocalVariable(); //method has local x
useField(); // method uses class scpope's field x
useLocalVariable(); //reinitializes local x
useField(); // class scope's field x retains its value

System.out.printf("%nlocal x in main is %d%n", x);

	}//end main

	//create and initialize local var x during each call
	public static void useLocalVariable()
	{
		int x = 25;
		System.out.printf("%nlocal x on entering useLocalVariable is %d%n", x);
		++x;
		System.out.printf("%nlocal x before exiting useLocalVariable is %d%n", x);	
	}//end method
	
	public static void useField()
	{
		System.out.printf("%nfield x on entering useField is %d%n", x);
		x *= 10;
		System.out.printf("%nfield x before exiting useField is %d%n", x);	
	}//end method
		
}//end class
