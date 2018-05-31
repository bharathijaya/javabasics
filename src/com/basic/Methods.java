package com.basic;

public class Methods {
	public boolean isEven(int one) {
		return one % 2 == 0 ? true : false;
	}
 public static void main(String[] args) {
	 Methods m1 = new Methods();
	 System.out.println("Is 4 a eve "+m1.isEven);
 }
}
