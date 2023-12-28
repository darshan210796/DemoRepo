package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PIMPages extends TestBase{
	@FindBy(xpath = "//h6[normalize-space()='PIM']")
	WebElement PIMLabel;
	
	@FindBy(name = "firstName")
	WebElement firstName;
	
	@FindBy(name = "middleName")
	WebElement middleName;
	
	@FindBy(name = "lastName")
	WebElement lastName;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement EmployeeId;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveBtn;
	
	
	
	public PIMPages()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyPIMLabel()
	{
		return PIMLabel.isDisplayed();
	}
	
	public void selectPIM(int i)
	{
		driver.findElement(By.xpath("//div[5]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]")).click();
	}
	
	


	public void PIMAddEmployee1(String firstName2, String middleName2, String lastName2, String employeeId2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
