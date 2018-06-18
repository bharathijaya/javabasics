package com.basic;

public class ProgramExamples11 {
	public static void main(String[] args) {
		String s="John",s1="Johny",s2="Janardhan";
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s2.length());
		s.substring(0,1);
		s.substring(1,3);
		s.substring(3,4);
		s1.substring(0,2);
		s1.substring(2,3);
		s1.substring(3,5);
		s2.substring(6,9);
		s2.substring(3,6);
		s2.substring(0,3);
		String s3=s.substring(0,1)+""+s1.substring(2,3)+""+s2.substring(6,9);
		String s4=s1.substring(1,3)+""+s1.substring(3,5)+""+s2.substring(0,3);
		String s5=s.substring(3,4)+""+s1.substring(0,2)+""+s2.substring(3,6);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		String result=s5.toUpperCase();
		System.out.println(result);
	/*	//System.out.println(s.substring(0,1));
		System.out.println(s.substring(1,3));
		String s1="Johny";
		//System.out.println(s1.substring(2,3));
		System.out.println(s.substring(3,5));
		String s2="Janardhan";
		//System.out.println(s2.substring(6,9));
		System.out.println(s.substring(0,3));
		String s3=s.substring(1,3)+""+s1.substring(3,5)+""+s2.substring(0,3);
		String s4="s3";
		System.out.println(s3);
		String result=s3.toUpperCase();
		System.out.println(result);*/
	}
	

}
