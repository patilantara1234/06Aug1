package scenarioPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TesNg3 
{
	@AfterMethod
	public  void setUp()
	{
		System.out.println("brwr open, url open,login activity");
	}
    @Test
	public void verifyLogin()
	{
		System.out.println("verifyLogin validation");
	}
	@BeforeMethod
	public void tearDown()
	{
		System.out.println("close browser");
		
	}
	
}
