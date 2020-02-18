package gradeBook;

public class GradeBook {

	// attributes
	private String courseName;
	private int[] grades;
	
	//constructor
	public GradeBook(String courseName, int[] grades) {
		this.courseName = courseName;
		this.grades = grades;
	}
	
	//set courseNmae
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	
	// get courseName
	public String getCourseName()
	{
		return courseName;
	}
	
	// perform various operations on the data
	public void processGrades() {
		// output grades array
		outputGrades();
		// get average
		System.out.printf("%nClass average is %.2f%n", getAverage());
		// get max and minimum
		System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());
		// output bar chart
		outputBarChart();
	}
	
	// minimum
	public int getMinimum() 
	{
		int lowGrade = grades[0];
		for (int grade : grades)
		{
			if (grade < lowGrade)
				lowGrade = grade;
		}
		return lowGrade;
	}
	
	// maximum
	public int getMaximum()
	{
		int highGrade = grades[0];
		for (int grade : grades)
		{
			if (grade > highGrade)
				highGrade = grade;
		}
		return highGrade;
	}
	// average
	public double getAverage()
	{
		int total = 0;
		
		for (int grade : grades)
			total += grade;
		return (double) total / grades.length;
	}
	
	// output bar chart
	public void outputBarChart()
	{
		System.out.println("grade distribution:");
		// store frequency of grades in each range of 10 grades
		int[] frequency = new int[11];
		// for each grade increment appropriate frequency
		for (int grade : grades)
			++frequency[grade / 10];
		for (int count = 0; count < frequency.length; count++)
		{
			if (count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
			// print asterisks
			for (int stars = 0; stars < frequency[count]; stars++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public void outputGrades()
	{
		System.out.printf("the grades are: %n%n");
		for (int student = 0; student < grades.length; student++)
			System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
	}
}
