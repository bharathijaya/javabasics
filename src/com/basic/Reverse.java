package com.basic;

public class Reverse {
	public static void main(String[] args) {
		int num = 9897,reverse = 0;
		while(num!=0) {
			int digits = num%10;
			 //reverse = reverse *10 + digits;
			num=num/10;
			
		}
		System.out.println(num);
	}
	

}
