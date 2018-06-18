package com.basicss;

public class Exception {
	public static void main(String[] args) {
			try {
		int a =20,b=0;
		int c =a/b;
		System.out.println(c);
	}
		catch(ArithmeticException e) {
			
			System.out.println(29);
		}
		}
}
