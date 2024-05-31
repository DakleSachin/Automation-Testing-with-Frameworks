package com.inetBanking.pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class AddAccountPage {
	
WebDriver Idriver;
	

	public AddAccountPage (WebDriver rdriver)
	{
		
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//a[normalize-space()='New Account']")
	@CacheLookup
	WebElement AddAccount;
	
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement Customerid;
	
	@FindBy(name= "selaccount")
	@CacheLookup 
	WebElement CustomerAccount;
	
	@FindBy(name="inideposit")
	@CacheLookup 
	WebElement CustomerAmmount;
	
	@FindBy(name="button2")
	@CacheLookup 
	WebElement CustSub;
	
	
	
	public void AddAccount() {
		AddAccount.click();
	}
		
	public void AddCustId (String CustID) {
		Customerid.sendKeys(String.valueOf(CustID));
			
    }
	
	public void AddCustType (String selaccount) {
		CustomerAccount.sendKeys(selaccount);
	}
	
	public void AddAmmount (String inideposit) {
		CustomerAmmount.sendKeys(inideposit);
	}
	
	public void AddSubmit() {
		CustSub.click();
		
    }
}

