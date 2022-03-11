package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage111 extends BaseClass  {
	
	public LoginPage111() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	
	public WebElement getName() {
		return name;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;


	
	
	
	
	
	
	
	
	
	
	

}
