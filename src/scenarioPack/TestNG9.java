package scenarioPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG9 
{
	@Test
	public void verifyLogin()
	{
		System.out.println("verifyLogin");
		Assert.assertTrue(false);
	}

	
	@Test(dependsOnMethods= {"verifyLogin"})
	public void verifybagProduct()
	{
		System.out.println("verifybagProduct");
	}
}
