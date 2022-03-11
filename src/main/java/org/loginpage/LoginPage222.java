package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage222 extends BaseClass {
	
	public LoginPage222() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtuser;
	
    @FindBy(id="password")	
    private WebElement txtpassword;
    
    @FindBy(xpath="//input[@type='Submit']")	
    private WebElement login;
    
    
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement btnLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
