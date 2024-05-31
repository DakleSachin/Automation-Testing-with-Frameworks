package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddAccountPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddNewAccount_003 extends BaseClass <TakesScreenshot>
      {
    
	
	@Test
	public void AddAcccount () throws InterruptedException, IOException {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		

		
		
		AddAccountPage add=new AddAccountPage(driver)	;

		add.AddAccount();
		add.AddCustId("76347");
		add.AddCustType("saving");
		add.AddAmmount("1000000");
		add.AddSubmit();
		
	
		
		if (driver.getTitle().equals("Account Generated Successfully!!!")) {
			
			Assert.assertTrue(false);
		}else {
			captureScreen(driver,"addNewAccount");
			Assert.assertTrue(true);
		}

		
	}

}
