package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage44 extends BaseClass{
	public LoginPage44() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="first_name")
	private WebElement firstname;

@FindBy(name="last_name")	
private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	
	@FindBy(name="cc_num")
	private WebElement creditnum;
	
	
	
	@FindBy(name="cc_type")
	private WebElement credittype;
	
	@FindBy(name="cc_exp_month")
	private WebElement expmonth;
	
	
	@FindBy(name="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvvnum;
	

	@FindBy(name="book_now")
	private WebElement book;


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCreditnum() {
		return creditnum;
	}


	public WebElement getCredittype() {
		return credittype;
	}


	public WebElement getExpmonth() {
		return expmonth;
	}


	public WebElement getExpyear() {
		return expyear;
	}


	public WebElement getCvvnum() {
		return cvvnum;
	}


	public WebElement getBook() {
		return book;
	}
	
	
	
	
	
	
	
	
	
	
	

}
