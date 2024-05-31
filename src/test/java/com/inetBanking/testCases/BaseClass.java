package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass<TakeScreenshot> {
	

	
	ReadConfig readconfig = new ReadConfig();
	
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		if (br.equals("Chrome"))
		{
			System.setProperty("webdriver.chorme.driver",readconfig.getchromepath());
			driver=new ChromeDriver();
		}
		
	
		driver.get(baseURL);
	}	
	
	@AfterClass
	public void tearDown()
	{
	//driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target =new File (System.getProperty("user.dir")+"/Screenshots/"+ tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot is taken");
		
	}
	
	public String randomestring()
	{
		String Genratedstring=RandomStringUtils.randomAlphabetic(8);
		return (Genratedstring);
	}
	
	public String randomeNum()
	{
		String Genratedstring2=RandomStringUtils.randomNumeric(4);
		return (Genratedstring2);
	}

}
