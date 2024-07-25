package com.siiet.aplication;

import com.siiet.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	
	public MMCurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		//TODO Auto-generated constructor stub
		
	}
	public void withdraw(float accBal) {
		System.out.println("Dear current account user.your account balance are:"+getAccBal()+"creditLimit"+getCreditLimit());
	
		
	
		
	
	}

}


