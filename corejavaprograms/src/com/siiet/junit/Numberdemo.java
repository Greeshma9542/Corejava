package com.siiet.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Numberdemo {
	@Test
	
	    void factorialtest() {
		int exp=80;
		int act=Numberfunction.getFactorial(5);
		assertEquals(exp,act);
	}

}
