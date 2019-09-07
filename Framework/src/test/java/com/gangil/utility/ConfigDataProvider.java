package com.gangil.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public void ConfigDataProvider()
	{
		
		File src = new File("./Config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to load config file"+e.getMessage());
		}
		
	}

	public String getDataFormConfig(String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
		
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getStagingURL()
	{
		
		return pro.getProperty("qaURL");
	}
	
}
