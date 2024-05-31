package com.inetBanking.testCases;




import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddAccountPage;
import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.DepositFormPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass<TakesScreenshot>{
	
	@Test
	public void LoginTest () throws IOException
	{
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		AddCustomerPage ad=new AddCustomerPage(driver);
		
		ad.ClickAddNewCustomer();
		ad.CustName("pavan");
		ad.CustGender("male");
		ad.CustDob("15", "5", "2000");
		ad.CustAddr("India");
		ad.CustCity("maharashtra");
		ad.CustState("maharashtra");
		ad.CustPin("2354165");
		ad.CustNo("12345678552");
		String Email=randomestring()+"@gmail.com";
		ad.CustMail(Email);
		ad.CustPassword("123456789");
		ad.CustSub();
		
		AddAccountPage ac=new AddAccountPage(driver);
		
		ac.AddAccount();
		ac.AddCustId("45526");
		ac.AddCustType("saving");
		ac.AddAmmount("5215245");
		ac.AddSubmit();
		
	    DepositFormPage de=new DepositFormPage(driver);
	    
	    de.DepostURL();
	    de.accountno("135233");
	    de.balance("66565");
	    de.desc("deposit money");
	    de.Accsubmit();
		
		
		
		
		
		if (isAlartPresent()==true) {
			captureScreen(driver,"LoginTest");
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
					
		}
		else if (driver.getTitle().equals("demo.guru99.com")){
			
			Assert.assertTrue(true);
			
		}else {
			
			Assert.assertTrue(false);
		}
	
	}
	
	
	
	
	
	public boolean isAlartPresent() {
		
		try {
			driver.switchTo().alert();
			return true ;
		}
		catch(NoAlertPresentException e )
		{
			return false;
		}
	}
}



/*if (driver.getTitle().equals("Guru99 Bank Manager HomePage123")) {
			
			Assert.assertTrue(true);
		}
		else {
			
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
		}*/