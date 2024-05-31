package com.inetBanking.testCases;





import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.EditCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_EditCustomer_004 extends BaseClass <TakesScreenshot> {
	
	@Test
	public void EditCustomer() {
		
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		EditCustomerPage Edit=new EditCustomerPage(driver);
		
		Edit.EditBtn();
		Edit.EditCustomer("76347");
		Edit.Editsub();
		Edit.EditPin("123456");
		Edit.EditSubmit2();
		
		
	   
		
		if (isAlartPresent()==true) {
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
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
