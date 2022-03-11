package org.testngggg;

import java.util.Date;

import org.base.BaseClass;
import org.loginpage.LoginPage222;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sampleeeeeee extends BaseClass {
	@BeforeClass
	private void beforeclass() {
	chromeLaunch();
	impwait(10);

	
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
	
	@Test(priority=1,invocationCount=1,enabled=true)
	private void test1() throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
		LoginPage222 l=new LoginPage222();
		sendkeys(l.getTxtuser(), "Gayathri");
		sendkeys(l.getTxtpassword(), "9840106846");
		Click(l.btnLogin());
		Thread.sleep(5000);

	}
	
	
//	@Test(priority=1,invocationCount=2,enabled=false)
	//private void test2() {
	//urlLaunch("https://www.snapdeal.com/login");
	//LoginPage222 l= new LoginPage222();
	//sendkeys(l.getTxtuser(), "Gayathri");
	//sendkeys(l.getTxtpassword(), "2345634");
	//Click(l.btnLogin());

	//}
	
	@Test(enabled=true)
	private void test3() {
		System.out.println("Test3--------------------");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
