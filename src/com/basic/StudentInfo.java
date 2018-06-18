package com.basic;
import java.util.Arrays;

public class StudentInfo {
	public static void main(String[] args) {
		Student s1 = new Student("jaya",96,"731615106029");
		Student s2 = new Student("kavi",98,"731615106036");
		Student s3 = new Student("kd",97,"731615106040");
		Student[] a = {s1,s2,s3};
		System.out.println(Arrays.toString(a));
		
	}

}