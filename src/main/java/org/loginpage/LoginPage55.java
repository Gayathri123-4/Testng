package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage55 extends BaseClass {

	public LoginPage55() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrderid() {
		return orderid;
	}
	@FindBy(xpath="(//input[@type='text'])[16]")
	private WebElement orderid;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
