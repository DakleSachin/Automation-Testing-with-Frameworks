package com.inetBanking.testCases;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.DepositFormPage;
import com.inetBanking.pageObjects.LoginPage;



public class TC_DepositForm_005 extends BaseClass<TakesScreenshot>{
	
	@Test
	public void Depositform() {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		DepositFormPage dep=new DepositFormPage(driver);
		
		dep.DepostURL();
		dep.accountno("135201");
		dep.balance("1500000");
		dep.desc("this is my all seving");
		dep.Accsubmit();
		
		if (driver.getTitle().equals("demo.guru99.com")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	}
	

}
