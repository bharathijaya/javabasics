package com.basic;

public class Multiple {
	public boolean isMultiple(int one,int two) {
		return two % one == 0 ? true : false;
	}

	public static void main(String[]args) {
		Multiple m1 = new Multiple();
		System.out.println("Is 4 a multiple of 2"+m1.isMultiple(4,2));
		
	}

}
