package employee;
import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee headTeacher = new Employee(null, null, 0, 0);
		Employee deputyHeadTeacher = new Employee (null, null, 0, 0);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//headTeacher
		System.out.println("please enter headTeacher salary: ");
		double headMonthlySalary = input.nextDouble();
		headTeacher.setHeadMonthlySalary(headMonthlySalary);
	
		
		
		//deputyHeadTeacher
		System.out.println("please enter deputyHeadTeacher salary: ");
		double deputyMonthlySalary = input.nextDouble();
		deputyHeadTeacher.setDeputyMonthlySalary(deputyMonthlySalary);
		
		//head yearly salary
		System.out.printf("%nheadteachers yearly salary is %.2f", 
				headTeacher.headYearlySalary(headMonthlySalary));
		//deputy yearly salary
		System.out.printf("%ndeputyteachers yearly salary is %.2f", 
				deputyHeadTeacher. deputyYearlySalary ( deputyMonthlySalary));
		
	}//end main

}//end class
