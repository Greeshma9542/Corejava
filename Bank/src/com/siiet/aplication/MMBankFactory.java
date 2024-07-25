package com.siiet.aplication;

import com.siiet.framework.BankFactory;
import com.siiet.framework.CurrentAcc;
import com.siiet.framework.SavingAcc;

public class MMBankFactory implements BankFactory {
	
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		SavingAcc savingacc=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
				
		return savingacc;
	}
    @Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
	
		CurrentAcc currentacc=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return currentacc;
	}
}