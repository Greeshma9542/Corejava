package com.siiet.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterizedtestdemo {
	@ParameterizedTest
	@ValueSource(strings= {"cali","bali","dali"})
	
	void endswitch(String str) {
		assertTrue(str.endsWith("i"));
		
	}

}
