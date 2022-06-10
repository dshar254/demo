package com.mycom.inheritance;

public class Person {
	String dob;
	String address;
	String gender;
	
	public Person(String vdob, String vaddress, String vgender) {
		this.dob = vdob;
		this.address = vaddress;
		this.gender = vgender;
		
	}
	public void showPersonDetails() {
		System.out.println(dob + "\t" + address + "\t" + gender + "\t" + dob +"\t");
	}

}
