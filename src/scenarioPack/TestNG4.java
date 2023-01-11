package scenarioPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG4 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("1-> BeforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("2--> beforeTest");
		
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("3--> BeforeClass");
	}
	
	@BeforeMethod
	public void afterMethod()
	{
		System.out.println("4--> AfterMethod");
			
	}
@Test
public void verifyLogin()
{
	System.out.println("5.1--> @Test--> verifyLogin");
}
@Test
public void verifylogOut()
{
	System.out.println("5.2 @Test--> verify logOut");
}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("6--> afterMethod");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("7--> AfterClass");
	}
@AfterTest
public void afterTest()
{
	System.out.println("8--> afterTest");
}

@AfterSuite
public void afterSuit()
{
	System.out.println("9--> afterSuit");
	
}



}
