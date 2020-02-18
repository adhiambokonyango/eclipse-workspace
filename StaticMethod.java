package staticMethod;



public class StaticMethod {

	//account of name and balance
	//instance
	private String name;
	private double balance;
	//end instance
	
	//constructor
	public StaticMethod (String name, double balance)
	{
		this.name = name;
		if (balance > 0.0)
			this.balance = balance;
	}//end constructor
	//end constructor

	//getters and setters
	public String getName() {//get name
		return name;
	}
	public void setName(String name) {//set name
		this.name = name;
	}
	public double getBalance() {//get balance
		return balance;
	}
	public void setBalance(double balance) {//set balance
		this.balance = balance;
	}
	// end getters and setters
	
	//deposit method
	public double depositAmount (double deposit)
	{
		balance = balance + deposit;
		return balance;
	}//end deposit method
	//end deposit method
	
}//end class

