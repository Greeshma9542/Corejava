package com.siiet.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Assertdemo {
   @Test
   public void testforassertequal() {
	   int res=1;
	   int exp=1;
	   
	   assertEquals(res,exp);
   }
   @Test
   void testassertTrue() {
	   assertTrue("hello". contains("i"));
   }
   @Test
   void testnull() {
	   String n="i";
	   assertNull(" ");
	   
	   
	   
   }
}
