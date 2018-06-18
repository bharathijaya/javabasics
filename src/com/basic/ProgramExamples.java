package com.basic;

public class ProgramExamples {
	public static void main(String[] args) {
		String s="John";
		System.out.println(s.substring(0,1));
		String s1="Johny";
		System.out.println(s1.substring(2,3));
		String s2="Janardhan";
		System.out.println(s2.substring(6,9));
		String s3=s.substring(0,1)+""+s1.substring(2,3)+""+s2.substring(6,9);
		String s4="s3";
		System.out.println(s3);
		String result=s3.toUpperCase();
		System.out.println(result);
		
	}

}
