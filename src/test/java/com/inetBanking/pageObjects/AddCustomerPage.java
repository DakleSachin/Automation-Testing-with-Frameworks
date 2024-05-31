package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	
WebDriver Idriver;
	

	public AddCustomerPage (WebDriver rdriver)
	{
		
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	@CacheLookup
	WebElement texCustURL;
	
	@FindBy(name="name") 
	@CacheLookup
	WebElement txtCustName;
	
	@FindBy(name="rad1")
	@CacheLookup
	WebElement txtCustGender;

	@FindBy(name="dob")
	@CacheLookup
	WebElement txtCustDob;

	@FindBy(name="addr")
	@CacheLookup
	WebElement txtCustAddr;

	@FindBy(name="city")
	@CacheLookup
	WebElement txtCustCity;

	@FindBy(name="state")
	@CacheLookup
	WebElement txtCustState;

	@FindBy(name="pinno")
	@CacheLookup
	WebElement txtCustPin;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement txtCustNo;

	@FindBy(name="emailid")
	@CacheLookup
	WebElement txtCustGmail;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtCustPassword;

	@FindBy(name="sub")
	@CacheLookup
	WebElement txtCustSub;

	
	public void ClickAddNewCustomer () {
		
		texCustURL.click();	
	}
	

	public void CustName (String cname) {
		
		txtCustName.sendKeys(cname);
	}
	
   public void CustGender (String cGender) {
		
	   txtCustGender.sendKeys(cGender);
	}
	
   public void CustDob (String MM, String DD, String YY) {
		
	   txtCustDob.sendKeys(MM);
	   txtCustDob.sendKeys(DD);
	   txtCustDob.sendKeys(YY);
	}
   
   public void CustAddr (String cAddr) {
		
	   txtCustAddr.sendKeys(cAddr);
	}
   
   public void CustCity (String cCity) {
		
	   txtCustCity.sendKeys(cCity);
	}
	
   
   public void CustState (String cState) {
		
	   txtCustState.sendKeys(cState);
	}
	
   
   public void CustPin (String cPinno) {
		
	   txtCustPin.sendKeys(String.valueOf(cPinno));
	}
	
   
   public void CustNo (String ctelephoneno) {
		
	   txtCustNo.sendKeys(ctelephoneno);
	}
   
   public void CustMail (String cemailid) {
		
	   txtCustGmail.sendKeys(cemailid);
	}
	
   
   public void CustPassword (String cPassword) {
		
	   txtCustPassword.sendKeys(cPassword);
	}
	
   
   public void CustSub () {
		
	   txtCustSub.click();;
	}
	
 
	

}
