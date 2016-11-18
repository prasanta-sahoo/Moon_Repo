package com.pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.IsEditable;

public class prasanta {
	WebDriver driver;
	
	
	@Test
	public void openurl() throws IOException
	{
		
		Properties prop= new Properties();
		FileInputStream input= new FileInputStream("./Applicationproperties.properties");
		
		prop.load(input);
		 driver= new FirefoxDriver();
		 
		
	driver.get("http://newtours.demoaut.com");
		
	driver.findElement(By.name(prop.getProperty("login.username"))).sendKeys("kshri14390");
	driver.findElement(By.name(prop.getProperty("login.psw"))).sendKeys("Ks4567");

	driver.findElement(By.name(prop.getProperty("login.submit"))).click();


	}
	
	
	
}
