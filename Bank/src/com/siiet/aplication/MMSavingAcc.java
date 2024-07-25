package com.siiet.aplication;

import com.siiet.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	public MMSavingAcc(int accNo,String accNm,float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal,isSalaried);
		//TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal) {
		System.out.println("dear Savings account user.your account balance are :"+getAccBal());
	
	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSaving()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccno()=" + getAccBal()
				+ ", getAccNm()=" + getAccBal() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


}
