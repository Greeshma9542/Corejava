package com.siiet.main;

import com.siiet.aplication.MMBankFactory;
import com.siiet.aplication.MMCurrentAcc;
import com.siiet.aplication.MMSavingAcc;

public class Client {

	public static void main(String[] arg) {
		MMBankFactory obj=new MMBankFactory();
		//saving account creation
		
		MMSavingAcc ga=(MMSavingAcc)obj.getNewSavingAccount(12,"sbi",500.6f,true);
		ga.withdraw(ga.getAccBal());
	
	//current account creation
     MMCurrentAcc ge=(MMCurrentAcc)obj.getNewCurrentAccount(13,"apgvb",500.6f,65.4f);
   ge.withdraw(ga.getAccBal());
	
	}

}


