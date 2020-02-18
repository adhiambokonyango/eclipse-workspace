package date;

public class Date {
	//instance
private int month;
private int date;
private int year;
//end instance

//constructor
public Date ( int month,int date,int year)
{
	if (month > 0)
		this.month = month;
	if (date >0)
		this.date = date;
	if (year > 0)
		this.year = year;
}//end constructor
//end constructor


//getters and setters
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
//end getters and setters

//displayDate
public void displayDate (int month, int date, int year)
{
	System.out.printf("%d/%d/%d", month, date, year);
}//end displayDate
//end displayDate

}//end class
