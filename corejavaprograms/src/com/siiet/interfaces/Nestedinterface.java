package com.siiet.interfaces;

public class Nestedinterface implements Myinterface.MYinnerinterface {

	@Override
	public void print() {
		System.out.println("Inner interface");
	}
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
		System.out.println(Nestedinterface.id);
	}

}
