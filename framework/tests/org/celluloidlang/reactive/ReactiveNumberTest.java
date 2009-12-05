package org.celluloidlang.reactive;

import static org.junit.Assert.*;

import org.junit.Test;


public class ReactiveNumberTest {

		
	
		@Test
		public void testSetString(){
			ReactiveNumber x = new ReactiveNumber(4.0);
			ReactiveNumber y = new ReactiveNumber(x);
			assertEquals(x.getView(),y.getView());
			
			x.set(9.0);
			
		}
}
