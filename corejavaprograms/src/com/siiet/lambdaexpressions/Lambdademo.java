package com.siiet.lambdaexpressions;

public class Lambdademo {
	public static void main(String[] args) {	
		Message m=()->{return "hello world";};
		System.out.println(m.greet());
	}

}