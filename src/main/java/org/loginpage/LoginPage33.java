package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage33 extends BaseClass {
	 public LoginPage33() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radiobutton;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continueer;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinueer() {
		return continueer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
