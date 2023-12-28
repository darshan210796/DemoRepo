package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//a[normalize-space()='']")
	WebElement PIMlink;
	
	@FindBy(xpath="//a[normalize-space()='Add Employee']")
	WebElement AddEmployeelink;
	
	
	@FindBy(xpath="//a[normalize-space()='']")
	WebElement Leavelink;
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public PIMPages clickOnPIMLink()
	{
		PIMlink.click();
		return new PIMPages();
	}
	
	public LeavePage clickOnLeaveLink()
	{
		Leavelink.click();
		return new LeavePage();
	}
	
	

	public void clickOnAddEmployeelink() {
		Actions action = new Actions(driver);
		action.moveToElement(AddEmployeelink).build().perform();
		AddEmployeelink.click();
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
