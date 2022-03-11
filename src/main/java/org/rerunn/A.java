package org.rerunn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	private void test1() {
	System.out.println("TestA1");

	}
	
	@Test(retryAnalyzer = WithKnownFailed.class)
	private void test2() {
		
		Assert.assertTrue(false);
		System.out.println("TestA2");
		

	}
	
	@Test
	private void test3() {
		System.out.println("TestA3");

	}

}
