package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.PIMPages;
import com.crm.qa.util.TestUtil;

public class PIMPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testUtil;
	PIMPages pimPage;
	public PIMPageTest()
	{
		super();
	}
	
	@BeforeMethod 
	public void setUp()
	{
		initialization();
		loginpage = new LoginPage();
		testUtil = new TestUtil();
		pimPage = new PIMPages();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		pimPage = homepage.clickOnPIMLink();
	}
	
	@Test
	public void verifyPIMPageLabel()
	{
		Assert.assertTrue(pimPage.verifyPIMLabel(), "pim label is missing on the page");
	}
	
	@Test
	public void selectSinglePIMTest()
	{
		pimPage.selectPIM(0046);
	}
	
	@Test
	public void selectMultiplePIMTest()
	{
		pimPage.selectPIM(0046);
		pimPage.selectPIM(0204);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
