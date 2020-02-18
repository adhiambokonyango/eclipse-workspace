package hardWareInvice;
//class invoice
public class Invoice {
	//instance variable
private String number;
private String description;
private int quantity;
private double price;
//constructor
public Invoice (String number,String description, int quantity,double price)
{
	this.number = number;	
	this.description = description;
	if (quantity > 0.0)
		this.quantity = quantity;
	if (price > 0.0)
		this.price = price;
}
//getters and setters
public void setNumber(String number) {//set serial number
	this.number = number;
}

public String getnumber() {//get serial number
	return number;
}

public void setDescription(String description) {//set description
	if (description != null)
	this.description = description;
}

public String getDescription() {//get description
	return description;
}

public void setQuantity(int quantity) {// set quantity
	this.quantity = quantity;
}

public int getQuantity() {//get quantity
	return quantity;
}

public void setPrice(double price) {//set price
	this.price = price;
}
public double getPrice() {//get price
	return price;
}
//invoice
public double getInvoiceAmount (int quantity, double price)//cost
{
  price = quantity * price;	
	return price;
}//end cost
}//end class invoice
