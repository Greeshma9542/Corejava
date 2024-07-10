package com.siiet.interfaces;

public class DEmo  implements Childinterface{

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void show() {
	
		
	}
	
		public static void main(String[] args) {
			DEmo d=new DEmo();
			d.show();
			d.print();
			
	}

}
