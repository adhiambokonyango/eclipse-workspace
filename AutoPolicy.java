package autoPolicy;

public class AutoPolicy {
//instance
	private int accountNumber;// policy account number
	private String makeAndModel;//car that the policy applies to
	private String state;// two-letter state abbreviation
	//end instance
//constructor
	public AutoPolicy(int accountNumber, String makeAndModel, String state)
	 {
	this.accountNumber = accountNumber;
	 this.makeAndModel = makeAndModel;
	this.state = state;
	 }//end constructor
	//end constructor
	//getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getMakeAndModel() {
		return makeAndModel;
	}
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//end getter and setter
	
	// predicate method returns whether the state has no-fault insurance
	public boolean isNoFaultState()
	{
		//local variable
		boolean noFaultState;
		//end local variable
		// determine whether state has no-fault auto insurance
		switch(getState())
		{
		case "MA":
		case "NJ":
		case "NY":
		case "PA":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;
		}//end switch
		return noFaultState;
	}//end method
}//end class
