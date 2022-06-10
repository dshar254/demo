package com.mycom.inheritance;

public class Manager extends Employee{
int teamSize; //exclusice attribute of manager

Manager(int id, String name,float salary, int teamSize) {
	super(id,name,salary);
	this.teamSize = teamSize;
	
}
public void showTeamSize() {//exclusive method of manager class
	System.out.println("\tTeam size : " + teamSize);
}
//overriding computeHra() - hra% is 40% of salary
public void computeHra() {
	hra = salary * 0.40f;
	System.out.println("Manager's HRA " + hra);
}
public void showManagerDetails() {
	//toString() will be overridden when S.o.pln() is invoked
	System.out.println("Id : " + id + "\tName : " + name + "\tSalary : " + salary + "\tHRA : " + hra + "Team Size : " + teamSize);
}
}
