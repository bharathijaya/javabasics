package com.basic;

public class Pro {
	public static void main(String[]args) {
	int num1=5,num2=2,result;
	String operator=+;
	//String choice1 =  operator;
	switch(operator)
	{
	case "+" :
	result = num1  + num2;
	System.out.println(result);
	break;
	case "*" :
	result = num1 * num2;
	System.out.println(result);
	break;
	default:
	System.out.println("default");
	break;
	
	}

}
}
