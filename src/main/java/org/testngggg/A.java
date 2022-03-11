package org.testngggg;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A{
	
	
	

	//@BeforeClass
	//private void beforeclass() {
	//chromeLaunch();
	//impwait(10);

	
	//}
	//@AfterClass
	//private void afterclass() {
	//quit();

	//}
	
	//@BeforeMethod
	//private void beforemethod() {
		//Date d=new Date();
		//System.out.println("before time----------------"+d);

	//}
	
	//@AfterMethod
	//private void AfterClass() {
		//Date d=new Date();
		//System.out.println("after time----------------"+d);

	//}
		
	@Test(groups="smoke")
	private void test1() {
		System.out.println("testA1");

	}
	
	@Test(groups="smoke")
	private void test2() {
		System.out.println("testA2");

	}
	
	@Test(groups= "smoke")
	private void test3() {
		System.out.println("testA3");

	
		
	}
	@Test(groups= "smoke")
	private void test4() {
		System.out.println("testA4");	
	}
	
	@Test(groups= "smoke")
	private void test5() {
		System.out.println("testA5");
	}
		@Test(groups="sanity")
		private void test6() {
			System.out.println("testA6");
		}
		
		
			@Test(groups="regression")
			private void test7() {
				System.out.println("testA7");
			}
			@Test(groups="regression")
			private void test8() {
				System.out.println("testA8");
			}
		
			@Test(groups="retest")
			private void test9() {
				System.out.println("testA9");
			}
		
		
		
	}
	
	
	
	
	
	


