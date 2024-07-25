package com.siiet.framework;



public abstract class CurrentAcc extends BankAcc {
	private float creditLimit; 
	
	public void withdraw(float accBal) {
	}
	

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit= creditLimit;
		
	}


	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	public float getCreditLimit() {
		return creditLimit;
		
	}
	
	public void setCreditLimit(float creditLimit) {
		this.creditLimit=creditLimit;
	}


}
