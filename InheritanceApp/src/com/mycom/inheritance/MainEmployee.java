package com.mycom.inheritance;

public class MainEmployee {

	public static void main(String[] args) {
		Employee kumar = new Employee(1001,"Kumar",30000.00f);
		Manager prakash = new Manager(1005, "Prakash",40000.00f,25);
		
		kumar.login();
		kumar.logout();
		
		prakash.login();
		prakash.logout();
		
		kumar.computeHra();
		prakash.computeHra(); //will be of 40% on salary
		
		prakash.showTeamSize();
		//kumar.showEmpDetails();
		System.out.println(kumar);
		prakash.showManagerDetails();

	}

}
