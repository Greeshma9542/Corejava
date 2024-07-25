package com.siiet.Application;

import com.siiet.framework.NormalAcc;

public class GSNormal extends NormalAcc {

	public GSNormal(int accNo, String accNm, float charges,float deliverycharges) {
		super(accNo, accNm, charges,deliverycharges);
		//TODO Auto-generated constructor stub
		
	}
	public void bookproduct(float charges) {
		System.out.println("Dear normal account user.your product charges are:"+getCharges()+"deliverycharges"+getDeliverycharges());
	
		
	}

}
