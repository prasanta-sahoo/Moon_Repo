package com.pro;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Kiran {
	

@BeforeSuite
public void m1()
{
	System.out.println("Database connection");
	Reporter.log("Database connection");
}


@AfterSuite
public void m2()
{
	System.out.println("Disconnect the database");
	Reporter.log("Disconnect the database");
}




	@BeforeMethod
	public void cde()
	{
		System.out.println("1st execute");
		
		Reporter.log("1st execute");

		
	}

	@Test(priority=2)
	public void bcd()
	{
		System.out.println("2nd execute");
		
		Reporter.log("2nd execute");

	}
	@Test(priority=0)
	public void abc()
	{
		System.out.println("3nd execute");
		Reporter.log("3nd execute");

	}

	
	
}
