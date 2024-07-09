package com.siiet.constructor;

public class Conexample {
	Conexample() {
		System.out.println("default con");
	}
	Conexample(int i) {
		System.out.println("Welcome");
	}
		Conexample(int i,int j) {
			System.out.println("Hello world");
		}
		Conexample(int i,String n) {
			System.out.println("different type");
		}
	

	public static void main(String[] args) {
		
		Conexample c=new Conexample();
		Conexample c1=new Conexample(6);
		Conexample c2=new Conexample(8,"t");
		
	}

}
