package employee;

public class Employee {
private String firstName;//instance
private String lastName;//instance
private double headMonthlySalary;//instance
private double deputyMonthlySalary;//instance

//constructor
public Employee (String firstName, String lastName,double headMonthlySalary,double deputyMonthlySalary)
{
	this.firstName= firstName; // Assign value
	this.lastName = lastName;
	if (headMonthlySalary > 0.0)
		this.headMonthlySalary = headMonthlySalary;	
	if (deputyMonthlySalary > 0.0)
		this.deputyMonthlySalary = deputyMonthlySalary;	
}//end constructor

//getters and setters
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public double getHeadMonthlySalary() {
	return headMonthlySalary;
}

public void setHeadMonthlySalary(double headMonthlySalary) {
	this.headMonthlySalary= headMonthlySalary;
}
	
	public double getDeputyMonthlySalary() {
		return deputyMonthlySalary;
	}

	public void setDeputyMonthlySalary(double deputyMonthlySalary) {
		this.deputyMonthlySalary= deputyMonthlySalary;
}

//end getters and setters

//yearly salary
public double headYearlySalary (double headMonthlySalary)
{
	double headYearlySalary;
	headYearlySalary = headMonthlySalary *12;
	return headYearlySalary;
}

public double deputyYearlySalary (double deputyMonthlySalary)
{
	double deputyYearlySalary;
	deputyYearlySalary = deputyMonthlySalary *12;
	return deputyYearlySalary;
}
//end yearly salary


}//end class
