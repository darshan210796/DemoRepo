package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath ="//input[@placeholder='Username']")
	WebElement username; 
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath ="//button[@type = 'submit']")
	WebElement loginBtn;
	
	@FindBy(xpath ="//img[contains(text(), 'OrangeHRM')]")
	WebElement OrangeHRMlogo;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateorangehrmImage()
	{
		return OrangeHRMlogo.isDisplayed();
	}
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
