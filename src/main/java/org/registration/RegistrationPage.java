package org.registration;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement create;
	@FindBy(name="firstname")
	private WebElement first;
	@FindBy(name="lastname")
	private WebElement last;
	public WebElement getCreate() {
		return create;
	}
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return last;
	}
	
	
	
	
	

}
