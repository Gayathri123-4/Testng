package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHotel extends BaseClass{
	
	public LoginPageHotel() {
		PageFactory.initElements(driver, this);
	}
@FindAll({@FindBy(xpath="//select[@name='location']"),@FindBy(id="location")})
private WebElement locations;
	
@FindAll({@FindBy(xpath="//select[@name='hotels']"),@FindBy(id="hotels")})
private WebElement hotels;
	
	
@FindAll({@FindBy(id="room_type"),@FindBy(name="room_type")})
private WebElement roomType;
	
@FindAll({@FindBy(name="room_nos"),@FindBy(id="room_nos")})
private WebElement noofrooms;
	
@FindBy(name="adult_room")	
private WebElement adultsproom;

@FindBy(name="child_room")
private WebElement childrensroom;

@FindBy(name="Submit")
private WebElement search;
//getters

public WebElement getLocations() {
	return locations;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNoofrooms() {
	return noofrooms;
}

public WebElement getAdultsproom() {
	return adultsproom;
}

public WebElement getChildrensroom() {
	return childrensroom;
}

public WebElement getSearch() {
	return search;
}













	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
