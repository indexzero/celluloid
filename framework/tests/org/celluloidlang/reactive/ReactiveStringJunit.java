package org.celluloidlang.reactive;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * tests reactive strings
 * @author blake
 *
 */
public class ReactiveStringJunit extends TestCase {

	/**
	 * setUp() method that initializes common objects
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * tearDown() method that cleanup the common objects
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public static Test suite() {
		TestSuite suite = new TestSuite(ReactiveStringJunit.class);
		return suite;
	}

	/**
	 * Constructor for BookTest.
	 * 
	 * @param name
	 */
	public ReactiveStringJunit(String name) {
		super(name);
	}

	public void testSetString() {
		ReactiveString a = new ReactiveString("hello");

		ReactiveString c = new ReactiveString(a);

		assertTrue(c.getLocal().equals("hello"));
		a.setString("world!");
		assertTrue(c.getLocal().equals("world!"));

	}

	public void testAppend() {
		ReactiveString a = new ReactiveString("hello");
		ReactiveString b1 = new ReactiveString(" world!");
		//b is now reacting off b1
		ReactiveString b = new ReactiveString(b1);
		//c reacts off of a
		ReactiveString c = new ReactiveString(a);
		
		//c reacts on a and b
		c.append(b);
		
		//verify c appended the two
		assertTrue(c.getLocal().equals("hello world!"));
		
		//change a
		a.setString("goodbye");
		System.out.println(c);
		
		//verify c reacted
		assertTrue(c.getLocal().equals("goodbye world!"));
		
		//change b1
		b1.setString(" mom!");
		System.out.println(c);
		
		//verify b and c reacted
		assertTrue(c.getLocal().equals("goodbye mom!"));
		
		//set a to react on b1
		ReactiveString a1 = new ReactiveString(b1);
		c.append(a1);
		System.out.println(c);
		assertTrue(c.getLocal().equals("goodbye mom! mom!"));
		
		//change b1
		b1.setString(" double");
		
		//verify c reacted 
		System.out.println(c);
		assertTrue(c.getLocal().equals(" double double"));
	}

	public void testAppendString() {
		ReactiveString a = new ReactiveString("hello");
		ReactiveString c = new ReactiveString(a);
		c.append(" world!");
		assertTrue(c.getLocal().equals("hello world!"));
		a.setString("goodbye");

		assertTrue(c.getLocal().equals("goodbye world!"));
		c.setString("goodbye mom!");

		assertTrue(c.getLocal().equals("goodbye mom!"));

	}

	public void testCyclicDependency() {
		ReactiveString a = new ReactiveString("hello");
		ReactiveString b1 = new ReactiveString(" world!");
		ReactiveString b = new ReactiveString(b1);
		ReactiveString c = new ReactiveString(a);
		c.append(b);
		try {
			b1.append(c);
			fail("Should raise an RuntimeException, for cyclic dependencies");

		} catch (RuntimeException success) {
		}

	}

}
