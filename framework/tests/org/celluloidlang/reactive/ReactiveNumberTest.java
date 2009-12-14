package org.celluloidlang.reactive;

import static org.junit.Assert.*;

import org.celluloidlang.reactive.ReactiveObject.Action;
import org.junit.Test;


public class ReactiveNumberTest {

		
	
		@Test
		public void testSetString(){
			ReactiveNumber x = new ReactiveNumber(4.0);
			ReactiveNumber y = new ReactiveNumber(x);
			assertEquals(x.getView(),y.getView());
			
			x.set(9.0);
			assertEquals(x.getView(),y.getView());
		}
		
		@Test
		public void testActions(){
			ReactiveNumber x = new ReactiveNumber(4.0);
			x.action(Action.SUB, new Float(3.0));
			assertEquals(x.getView(),new Float(1.0));
			
			x.action(Action.MULT, new Float(9.0));
			assertEquals(x.getView(),new Float(9.0));
		}
		
		@Test
		public void testReaction(){
			/*
			 * number x = 4
			 * number y = 2
			 * number z = 2
			 * number b = 3
			 * x -= y
			 * z *= b
			 * x *=z
			 * a = x + y
			 * y = 1
			 */
			
			ReactiveNumber x = new ReactiveNumber(4.0);
			ReactiveNumber y = new ReactiveNumber(2.0);
			ReactiveNumber z = new ReactiveNumber(2.0);
			ReactiveNumber b = new ReactiveNumber(3.0);
			x.action(Action.SUB, y);
			assertEquals(x.getView(),new Float(2.0));
			z.action(Action.MULT, b);
			assertEquals(z.getView(),new Float(6.0));
			x.action(Action.MULT, z);
			assertEquals(x.getView(),new Float(12.0));
			
			ReactiveNumber a = new ReactiveNumber(x);
			a.action(Action.ADD, y);
			
			y.set(1.0);
			assertEquals(x.getView(),new Float(18.0));

		}
}
