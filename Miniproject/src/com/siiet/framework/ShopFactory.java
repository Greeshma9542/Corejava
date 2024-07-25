package com.siiet.framework;

public interface ShopFactory {
	
	public PrimeAcc getNewPrimeAcc(int Accno,String AccNm,float charges,boolean isprime);
	public NormalAcc getNewNormalAcc(int AccNo,String AccNm,float charges,float deliverycharges);
	

}
