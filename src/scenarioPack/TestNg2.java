package scenarioPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg2 
{
	@BeforeMethod
public void Method1() 
{
	System.out.println("@BeforeMethod->Method1");
	
}
	@Test
public void Method2()
{
	System.out.println("@Test-> Method2");

}
	@AfterMethod
public void Method3()
{
	System.out.println("@AfterMethod-> Method3");
	
}












}

