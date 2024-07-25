package com.siiet.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL=0;
	
	
	public boolean isSalaried() {
		return isSalaried;
	}
	
	public void setSaving(boolean isSalaried) {
		this.isSalaried=isSalaried;
		
	}
	
	public static float getMINBAL() {
		return MINBAL;
		
		
	}
	
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried()+"]";
		
	}

	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo,accNm,accBal);
		this.isSalaried = isSalaried;
	}


	

	
	public void withdraw(float accBal) {
	
		
	}
	

}
