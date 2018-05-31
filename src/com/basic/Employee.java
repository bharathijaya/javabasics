package com.basic;

public class Employee {
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		emp1.setName("name");
		emp1.setSalary(10000);
		Employee emp2 = new Employee();
		emp2.setName("name");
		emp2.setSalary(20000);
		double salary = emp1.getSalary();
		salary = salary*1.1;
		emp1.setSalary(salary);	
		System.out.println(salary);
		}
	}
	


