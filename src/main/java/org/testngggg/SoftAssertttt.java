package org.testngggg;

import java.util.Date;

import org.base.BaseClass;
import org.loginpage.LoginPage222;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertttt extends BaseClass{
	
	@BeforeClass
	private void beforeclass() {
	chromeLaunch();
	impwait(20);

	}
	
	@AfterClass
	private void afterclass() {
		quit();

		}
		
		@BeforeMethod
		private void beforemethod() {
			Date d=new Date();
			System.out.println("before time----------------"+d);

		}
		
		@AfterMethod
		private void AfterClass() {
			Date d=new Date();
			System.out.println("after time----------------"+d);

		}
		
@Test(priority=2,invocationCount=1,enabled=true)
private void test1() throws InterruptedException {
	urlLaunch("http://www.facebook.com/");
	
	SoftAssert s=new SoftAssert();
	s.assertTrue(getcurrenturl().contains("flipkart"),"verify url");
	LoginPage222 l=new LoginPage222();
	
	sendkeys(l.getTxtuser(), "Bala");
	sendkeys(l.getTxtpassword(), "23456789");
	Click(l.btnLogin());
	Thread.sleep(5000);
	s.assertAll();
	
	
}
@Test(priority=1)
private void test2() {
	System.out.println("test2");

}
@Ignore
@Test
private void test3() {
	System.out.println("test3");

}
















}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			