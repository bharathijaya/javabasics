package com.basic;

public class Invoice {
	String number;
	String description;
	int quantity;
	double price;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
			this.quantity = 0;
		}
		else
		{
			this.quantity = quantity;
		}
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 0.0) {
			this.price = 0.0;
		}
		else
		{
			this.price = price;
		}
		
	}
	public double getInvoiceAmount()
	{
		 return  price*quantity;
		
	}
	public static void main(String[] args)
	{
		Invoice v1 = new Invoice();
		v1.setQuantity(10);
		v1.setPrice(100);
		v1.setDescription("bolt");
		System.out.println(v1.getQuantity());
		System.out.println(v1.getInvoiceAmount());
		System.out.println(v1.getPrice());
	}


}
