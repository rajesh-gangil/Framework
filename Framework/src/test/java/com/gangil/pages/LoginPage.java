package com.gangil.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	//This is new commit for rajesh
	public void LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
		
	}

	@FindBy(name = "username") WebElement uname; 
	
	@FindBy(name = "password") WebElement pass;
	
	@FindBy(xpath = "//input[@value='Login']") WebElement loginButton;
	
	
	public void loginToCRM(String usernameApplication, String passwordApplication)
	{
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
	
}
