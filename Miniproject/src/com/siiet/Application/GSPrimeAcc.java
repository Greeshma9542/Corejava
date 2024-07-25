package com.siiet.Application;

import com.siiet.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	public GSPrimeAcc(int accNo,String accNm,float charges,boolean isprime) {
		super(accNo, accNm, charges,isprime);
		//TODO Auto-generated constructor stub
	}
	public void bookproduct(float charges) {
		System.out.println("dear prime user.your product charges are :"+getCharges());
	}
	
		
	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccno()=" + getAccno()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
