package com.siiet.inheritance;

public class Child extends Father {
	String cycle="pink";
	String car="audi";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		System.out.println(c.car);
		System.out.println(c.cycle);
		System.out.println(c.money);
		

	}

}
