package com.nissan.training.demoproject1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void testadd() {
		MyClass m=new MyClass();
		assertEquals(10, m.add(3, 7));
	}

	@Test
	public void testsub() {
		MyClass m=new MyClass();
		assertEquals(3, m.sub(10, 7));
	}
	
	@Test
	public void testmul() {
		MyClass m=new MyClass();
		assertEquals(1, m.mul(1, 1));
	}
}
