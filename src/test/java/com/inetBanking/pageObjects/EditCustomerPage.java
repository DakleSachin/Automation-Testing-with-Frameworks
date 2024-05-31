package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	WebDriver Idriver;
	
	public EditCustomerPage (WebDriver rdriver) {
		
		
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(css ="a[href='EditCustomer.php']")
	@CacheLookup
	WebElement Edit;
	
	@FindBy(name="cusid")
	@CacheLookup 
	WebElement EditCustomer;
	
	@FindBy(name="AccSubmit")
	@CacheLookup 
	WebElement Submit;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement pincode;
	
	@FindBy(name="sub")
	@CacheLookup 
	WebElement EditSubmit;
	
	
	
	public void EditBtn () {
		Edit.click();
	}
	
	public void EditCustomer(String cusid)
	{
		EditCustomer.sendKeys(cusid);
	}
	

	public void Editsub () {
		Submit.click();
	}
	
	public void EditPin(String pinno) {
		pincode.clear();
		pincode.sendKeys(String.valueOf(pinno));
	}
	
	public void EditSubmit2 () {
		EditSubmit.click();
	}

}
