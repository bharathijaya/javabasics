package com.basic;

import java.util.Collection;

public class Array {
	public static void main(String[]args) {
int n=1234;
int i=0;
int t;
int arr[] = new int[10];
while(n>0)
{
	t = n%10;
	arr[i]=t;
	i++;
	
	//sum = (sum * 10 )+ t;
	n = n/10;
	//System.out.println(t);
}
for( i=0;i<10;i++) {
	System.out.println(arr[i]);
 }

}

