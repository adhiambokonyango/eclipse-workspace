package student;

public class Student {
//name and average
	
	//instance
	private String name;
	private double average;
	//end instance
	
	//constructor
	public  Student (String name, double average)
	{
		this.name = name;
		if (average >=0)
		{
			if (average <= 100)
				this.average = average;
		}
	}//end constructor
	//end constructor

	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}//end getters and setters
	//end getters and setters
	
	//letterGrade
	public String getLetterGrade ()
	{
		String letterGrade = "";
		if (average >= 90.0)
			letterGrade = "A";
			else if (average >= 80.0)
			letterGrade = "B";
			else if (average >= 70.0)
			letterGrade = "C";
			else if (average >= 60.0)
			letterGrade = "D";
			else
			letterGrade = "F";
		return letterGrade;
	}//end letterGrade
	//end letterGrade
	
}//end class




