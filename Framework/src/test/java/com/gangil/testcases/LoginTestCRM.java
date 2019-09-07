package com.gangil.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.gangil.pages.BaseClass;
import com.gangil.pages.LoginPage;
import com.gangil.utility.BrowserFactory;
import com.gangil.utility.ExcelDataProvider;

public class LoginTestCRM extends BaseClass {
	
	@Test
	public void loginApp()
	{		
		
		logger = report.createTest("Login to CRM");
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		loginpage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
	}

}
