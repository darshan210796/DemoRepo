package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.PIMPages;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	PIMPages pimPage;
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod 
	public void setUp()
	{
		initialization();
		loginpage = new LoginPage();
		pimPage = new PIMPages();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyHomePageTitleTest()
	{
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "OrangeHRM", "Home page title not matched");
	}
	
	@Test
	public void verifyContactsLinkTest()
	{
		pimPage = homepage.clickOnPIMLink();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
