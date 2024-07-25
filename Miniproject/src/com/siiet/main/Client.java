package com.siiet.main;

import com.siiet.Application.GSNormal;
import com.siiet.Application.GSPrimeAcc;
import com.siiet.Application.GSShopFactory;

public class Client {

	public static void main(String[] arg) {
		GSShopFactory obj=new GSShopFactory();
		//prime account creation
		
		GSPrimeAcc ga=(GSPrimeAcc)obj.getNewPrimeAcc(12,"java",5006f,true);
		ga.bookproduct(ga.getCharges());
	
	//Normal account creation
	GSNormal ge=(GSNormal)obj.getNewNormalAcc(13,"spring",500.6f,65.4f);
   ge.bookproduct(ga.getCharges());
	
	}

}
