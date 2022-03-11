package org.rerunn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	@Test
	private void test1() {
	System.out.println("TestB1");

	}
	
	@Test(retryAnalyzer = WithKnownFailed.class)
	private void test2() {
		
		Assert.assertTrue(false);
		System.out.println("TestB2");
		

	}
	
	@Test
	private void test3() {
		System.out.println("TestB3");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
