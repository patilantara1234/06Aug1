package scenarioPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SDTC01_TestClass_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
public void VerifyLoginFunctionality() throws IOException
{
		
	System.out.println("Apply validation");
	
	String givenTitle="Swag Labs";
    String actualTitle=driver.getTitle();
    
    Assert.assertEquals(actualTitle,givenTitle);
    
    System.out.println("TC is Passed");
}
	
}