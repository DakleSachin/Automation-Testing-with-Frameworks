package com.inetBanking.pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositFormPage {
	
	WebDriver idriver;
	

	public DepositFormPage (WebDriver rdriver)
	{
		
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Deposit']")
	@CacheLookup
	WebElement Deposti;
	
	@FindBy(name="accountno")
	@CacheLookup
	WebElement Accno;
	

	@FindBy(name="balance")
	@CacheLookup
	WebElement bal;

	@FindBy(name="desc")
	@CacheLookup
	WebElement des;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement AccSub;
	
	
	public void DepostURL () {
		Deposti.click();
	}
	
	public void accountno (String accountno) {
		Accno.sendKeys(accountno);
	}
	
	public void balance (String balance) {
		bal.sendKeys(String.valueOf(balance));
	}
	
	public void desc(String desc) {
		des.sendKeys(desc);
	}
	
	public void Accsubmit() {
		AccSub.click();
	}
	

}
