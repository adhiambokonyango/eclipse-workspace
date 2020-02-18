package bank;

public class Account {
	
	private String name ; //instance variable
	
	private double balance;
	
	public Account (String name, double balance) 
	{
		this.name = name;
		
		if (balance > 0.0)
			this.balance = balance;
	}
	
	//name 
	//method to set name of the object
		public void setName (String name)
		{
			this.name = name; // store variable
		}
		
		public String getName( )
		{
			return name;//return value of name to caller
		}
	
	public double withdraw(double withdrawnAmount)
	{
		if (withdrawnAmount > 0.0) // if the withdrawntAmount is valid
			balance = balance - withdrawnAmount;
		return balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
	
	//deposit
	public void deposit (double depositAmount)
	{
		if (depositAmount > 0.0)    //valid deposit amount
			balance = balance + depositAmount;
		
	}
	
	
	
	
}//end class account
