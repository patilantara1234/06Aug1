package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2
{
	@AfterMethod
	public void method3() 
	{
		System.out.println("@AfterMethod-->method3() ");
		
	}
@Test
public void method2()
{
	System.out.println("@Test-->>method2()");
	
}
@BeforeMethod
public void method1()
{
	System.out.println("@BeforeMethod-->>method1()");
}



}
