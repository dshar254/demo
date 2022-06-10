package com.mycom.exceptions.userdefined;
import java.util.Scanner;
public class WithdrawApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		float balance, withdrawAmount;
		System.out.println("Enter Current balance");
		balance = scnr.nextFloat();
		System.out.println("Enter withdrawl amount");
		withdrawAmount = scnr.nextFloat();
		
		if( ( balance - withdrawAmount ) <0 ) {
			try {
				throw new NegativeBalanceException("Withdrawl amount should be less than or equal to the available balance");
				
			}catch (NegativeBalanceException nbe) {
				System.err.println(nbe.getMessage());
				System.exit(0);//program terminates successfully
			}
		}
		System.out.println("Available balance is " + (balance - withdrawAmount));

	}

}
