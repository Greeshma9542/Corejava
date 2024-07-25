package com.siiet.framework;

public class PrimeAcc extends ShopAcc {
	protected boolean isprime;
	private static final float deliverycharges = 0;
	
	
	public boolean isPrime() {
		return isprime;
	}
	
	public void setPrime(boolean isPrime) {
		this.isprime=isPrime;
		
	}
	
	public static float getDeliverycharge() {
		return deliverycharges;
		
		
	}
	
	@Override
	public String toString() {
		return "PrimeAcc [isprime=" + isprime + ", isPrime()=" + isPrime()+"]";
		
	}

	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges);
		this.isprime = isprime;
	}


	

	
	public void bookproduct(float charges) {
	
		
	}
	
	

}
