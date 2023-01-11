package scenarioPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SDTC02_TestClass_VerifyLogoutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogoutFunctionality()
	{	
		SDHome_POMClass sdh=new SDHome_POMClass(driver);
		
//		sdh.clickdropDown();
//		System.out.println(" click on drop down");
	
			sdh.clicksettingBtn();
			System.out.println(" click on setting button");
			
			sdh.clicklogOut();
			System.out.println(" click on logout button");
			
			System.out.println("Apply validation");
			
			String givenTitle="Swag Labs";
		    String actualTitle=driver.getTitle();
		    Assert.assertEquals(actualTitle,givenTitle);
		    System.out.println("TC is Passed");
	}
}
