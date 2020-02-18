package hardWareInvice;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice currentInvoice = new Invoice (null, null, 0, 0);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//serialNumber
		System.out.println("Please enter the serialNumber:");
		String theNumber  = input.nextLine();
		currentInvoice.setNumber(theNumber);
		//description
		System.out.println("please enter description: ");
		String theDescription = input.nextLine();
		currentInvoice.setDescription(theDescription);
		//quantity
		System.out.println("please enter amount of purchase: ");
		int quantity = input.nextInt();
		currentInvoice.setQuantity(quantity);
		//price
		System.out.println("enter price of item on purchase: ");
		int price = input.nextInt();
		currentInvoice.setPrice(price);
		
		//output center
		System.out.printf("%n%s",
				currentInvoice.getnumber());//output number of product
		System.out.printf("%n%s",
				currentInvoice.getDescription());//output description of product
		System.out.printf("%n%d",
				currentInvoice.getQuantity());//output quantity of product
		System.out.printf("%n$%.2f",
				currentInvoice.getPrice());//output price of product
		//cost of purchase
		currentInvoice.getInvoiceAmount(quantity, price);
		System.out.printf("%ncost is $%.2f",currentInvoice.getInvoiceAmount(quantity, price));
	}//end main

}//end class
