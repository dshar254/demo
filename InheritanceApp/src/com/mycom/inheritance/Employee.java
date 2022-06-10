package com.mycom.inheritance;

public class Employee {
	int id;
	String name;
	float salary,hra;
	
	Employee(int id, String name, float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public void login() {
		System.out.println("In the login method");
	}
	public void logout() {
		System.out.println("In the logout method");
	}
	public void computeHra() {
		hra = salary * 0.20f;
		System.out.println("Employee's HRA " + hra);
	}
	public void showDetails() {
		System.out.println("Id : " + id + "\tName : " + name + "\tSalary : " + salary + "\tHRA : " + hra);
	}
	@Override
	public String toString() {
		return "Id : " + id + "\tName : " + name + "\tSalary : " + salary + "\tHRA : " + hra ;
	}
	}


