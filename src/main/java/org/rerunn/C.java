package org.rerunn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C {
	@Test
	private void test1() {
	System.out.println("TestC1");

	}
	@Test(retryAnalyzer = WithKnownFailed.class)
	private void test2() {
		
		Assert.assertTrue(false);
		System.out.println("TestC2");
		

	}
	
	@Test
	private void test3() {
		System.out.println("TestC3");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
