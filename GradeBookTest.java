package gradeBook;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//grades
		int[] gradesArray = {87, 56, 78, 56, 45, 85, 78, 89, 63, 96};
		GradeBook myGradeBook = new GradeBook(
				 "CS101 Introduction to Java Programming", gradesArray);
				System.out.printf("Welcome to the grade book for%n%s%n%n",
				myGradeBook.getCourseName());
			    myGradeBook.processGrades();
	}

}
