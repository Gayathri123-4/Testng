package org.screenshot;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.loginpage.LogInPage;
import org.loginpage.LoginPage111;
import org.loginpage.LoginPage222;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShottt extends BaseClass{
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
		System.out.println("Before Method----------------------"+d);

	}
@AfterMethod
private void aftermethod(ITestResult a) throws IOException {
	Date d=new Date();
	System.out.println("After method------"+d);
	int st = a.getStatus();//2--->failed
	if(st==2) {
		String name = a.getName();
		screenshot("facebook" +name);
		
	}

}

	


@Test
private void test1() {
	urlLaunch("https://www.facebook.com/");
	Assert.assertTrue(false, "flipkart");
	LogInPage l=new LogInPage();
	sendkeys(l.getUser(), "Gayathri");
	sendkeys(l.getPassword(), "23456789");
	Click(l.getLogin());
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
