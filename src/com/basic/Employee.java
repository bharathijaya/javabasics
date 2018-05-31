package com.basic;

public class Employee {
	String firstname;
	String lastname;
	Double salary;
	//salary = 10000;
	private char[] set;
	private char[] get;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	if(salary>0)
	{
		System.out.println(set);	
	}
	else
	{
		System.out.println(get);
	}
	public static void main(String[] args)
	{
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		System.out.println(employee1.salary);
		System.out.println(employee2.salary);
		
		
		
	
	
		
		
		
		


