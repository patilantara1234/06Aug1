package scenarioPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG12 
{
	@Test
	public void Test1()
	{
		String expectedTitle="Swag Labs";
		String actualTitle=" Labs";
	    Assert.assertEquals(actualTitle,expectedTitle);
	
	}
	
	
 
}
