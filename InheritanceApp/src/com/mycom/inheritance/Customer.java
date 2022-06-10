package com.mycom.inheritance;

public class Customer extends Person{
	private String name;
	private String emailId;
	private float orderAmount;
	public Customer(String vdob, String vaddress, String vgender, String vname, String vemailId, float vorderAmount) {
		super(vdob,vaddress,vgender);
		//this must be the first statement in the sub class constructor
		name = vname;
		emailId = vemailId;
		orderAmount = vorderAmount;
		
	}
	public void showCustomerDetails() {
		System.out.println(dob + "\t" + address + "\t" + gender + "\t" + dob +"\t" + emailId + "\t" + orderAmount);
	}
}
