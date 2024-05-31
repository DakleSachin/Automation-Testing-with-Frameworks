package com.inetBanking.testCases;
import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddNewCustomer_002 extends BaseClass<TakesScreenshot>
{

	
	@Test
	public void addNewcustomer() throws InterruptedException, IOException {
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.ClickAddNewCustomer();		
		addcust.CustName("sachin");
		addcust.CustGender("male");
		addcust.CustDob("5", "8", "2000");
		addcust.CustAddr("INDIA");
		addcust.CustCity("sambhaji nagar");
		addcust.CustState("maharashtra");
		addcust.CustPin("1110101");
		addcust.CustNo("1645476534");
		
		String Email=randomestring()+"@gmail.com";
		addcust.CustMail(Email);
		addcust.CustPassword("123456789");
		addcust.CustSub();
		
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		
		if (res == true ) {
			Assert.assertTrue(true);
		}
		else {
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
	}
	

}
