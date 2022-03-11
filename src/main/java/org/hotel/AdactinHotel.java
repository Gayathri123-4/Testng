package org.hotel;

import java.util.Date;

import org.base.BaseClass;
import org.loginpage.LoginPage111;
import org.loginpage.LoginPage222;
import org.loginpage.LoginPage33;
import org.loginpage.LoginPage44;
import org.loginpage.LoginPage55;
import org.loginpage.LoginPageHotel;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdactinHotel extends BaseClass {
	
	@BeforeClass
	private void beforeclass() {
	chromeLaunch();
	impwait(10);

	
	}
	@AfterClass
	private void afterclass() {
	//quit();

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
		urlLaunch("http://adactinhotelapp.com/\r\n");
		SoftAssert s=new SoftAssert();
		s.assertTrue(getcurrenturl().contains("adactin"),"verify url");

		LoginPage222 l1=new LoginPage222();
sendkeys(l1.getTxtuser(), "Gayathrikrish");
s.assertEquals(GetAttrtibute(l1.getTxtuser()), "Gayathrikrish","verify name");	

sendkeys(l1.getTxtpassword(), "Gayathri@(0606)");
s.assertEquals(GetAttrtibute(l1.getTxtpassword()), "Gayathri@(0606)","verify password");	
Click(l1.btnLogin());
Thread.sleep(5000);
s.assertTrue(getcurrenturl().contains("SearchHotel"),"verify after login");
		s.assertAll();
	}
	

	@Test(priority=2,invocationCount=1,enabled=true)
	private void test2() throws InterruptedException {
		SoftAssert s=new SoftAssert();
		

		LoginPageHotel l2=new LoginPageHotel();
		selectbyindex(l2.getLocations(), 1);

s.assertEquals(GetAttrtibute(l2.getLocations()), "Sydney","verify location");	

selectbyindex(l2.getHotels(), 2);
s.assertEquals(GetAttrtibute(l2.getHotels()), "Hotel Sunshine","verify hotel");	

selectbyindex(l2.getRoomType(), 1);
s.assertEquals(GetAttrtibute(l2.getRoomType()), "Standard","verify roomtype");	


selectbyindex(l2.getNoofrooms(), 2);
s.assertEquals(GetAttrtibute(l2.getNoofrooms()), "2","verify room");	


selectbyindex(l2.getAdultsproom(), 2);
s.assertEquals(GetAttrtibute(l2.getAdultsproom()), "2","verify adultroom");



selectbyindex(l2.getChildrensroom(), 3);
s.assertEquals(GetAttrtibute(l2.getChildrensroom()), "3","verify childroom");

Click(l2.getSearch());
Thread.sleep(2000);
s.assertTrue(getcurrenturl().contains("SelectHotel"),"verify after booking");
		s.assertAll();
	}
	
	@Test(priority=3,invocationCount=1,enabled=true)
	private void test3() throws InterruptedException {
		SoftAssert s=new SoftAssert();
		LoginPage33 l3=new LoginPage33();
		Click(l3.getRadiobutton());
		Click(l3.getContinueer());
		
		Thread.sleep(5000);
		s.assertTrue(getcurrenturl().contains("BookHotel"),"verify after booking");
		s.assertAll();
	}
	
	@Test(priority=4,invocationCount=1,enabled=true)
	private void test4() throws InterruptedException {
		SoftAssert s=new SoftAssert();
		LoginPage44 l4=new LoginPage44();
		
		sendkeys(l4.getFirstname(), "Gayathri");
	s.assertEquals(GetAttrtibute(l4.getFirstname()),"Gayathri" ,"verify firstname");
	
	sendkeys(l4.getLastname(),"bala");
	s.assertEquals(GetAttrtibute(l4.getLastname()),"bala" ,"verify lastname");
	
	sendkeys(l4.getAddress(), "chennai");
	s.assertEquals(GetAttrtibute(l4.getAddress()),"chennai" ,"verify address");
	
	sendkeys(l4.getCreditnum(), "1234567890123456");
	s.assertEquals(GetAttrtibute(l4.getCreditnum()),"1234567890123456" ,"verify creditnum");
	
	selectbyindex(l4.getCredittype(), 4);
	//s.assertEquals(GetAttrtibute(l4.getCredittype()),"4" ,"verify crredittype");
	

	selectbyindex(l4.getExpmonth(), 7);
	//s.assertEquals(GetAttrtibute(l4.getExpmonth()),"7" ,"verify month");
	
	selectbyindex(l4.getExpyear(), 8);
	//s.assertEquals(GetAttrtibute(l4.getExpyear()),"8" ,"verify year");
	
	sendkeys(l4.getCvvnum(), "876");
	s.assertEquals(GetAttrtibute(l4.getCvvnum()),"876" ,"verify ccvnum");
	
	
	Click(l4.getBook());
	Thread.sleep(7000);
	s.assertTrue(getcurrenturl().contains(""),"verify after booking");
	s.assertAll();
	}
	
	@Test(priority=5,invocationCount=1,enabled=true)
	private void test5() throws InterruptedException {
		SoftAssert s=new SoftAssert();
		LoginPage55 l5=new LoginPage55();
		
		movetoElement(l5.getOrderid());
		String attrtibute = GetAttrtibute(l5.getOrderid());
		
		System.out.println("orderid---------"+attrtibute);
		s.assertAll();
		
		
		
		
		
		
	
	
	}
	private void movetoElement(WebElement orderid) {
		// TODO Auto-generated method stub
		
	}
	
	}


