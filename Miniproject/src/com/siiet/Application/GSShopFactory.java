package com.siiet.Application;

import com.siiet.framework.NormalAcc;
import com.siiet.framework.PrimeAcc;
import com.siiet.framework.ShopFactory;

public class GSShopFactory implements ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		PrimeAcc primeacc=new GSPrimeAcc(accNo,accNm,charges,isprime);
				
		return primeacc;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliverycharges)
	{
		NormalAcc normalacc=new GSNormal(accNo,accNm,charges,deliverycharges);
		return normalacc;
	}

}
