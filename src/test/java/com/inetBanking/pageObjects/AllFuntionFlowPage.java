package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllFuntionFlowPage {
	
	WebDriver Idriver;
	
	public  AllFuntionFlowPage (WebDriver rdriver) {
		
		Idriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	@CacheLookup
	WebElement NewCustomerURl;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement CustomerName;
	
	@FindBy(name="rad1")
	@CacheLookup
	WebElement Gender;
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement DateOFBrth;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement Addres;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement City;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement State;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement PinNo;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement TelephoneNo;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement EmailId;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Submit1;
	
	
	
	

}
