package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int total = 0;
		
		while (x <= 10)
			{
			 int y = x * x;
			System.out.println(y);
			 total += y;
			 ++x;
			}
			
			System.out.printf("Total is %d%n", total);
	}

}
