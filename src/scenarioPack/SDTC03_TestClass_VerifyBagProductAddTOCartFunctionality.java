package scenarioPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SDTC03_TestClass_VerifyBagProductAddTOCartFunctionality extends TestBaseClass
{
	
	@Test
	public void verifyBagProductAddTOCartFunctionality()
	{
		SDHome_POMClass shp=new SDHome_POMClass(driver);
		shp.clickBagProductAddTOCart();
		System.out.println("Clicked on bag product");
		
		System.out.println("Apply the validation");
		String expectedCount = "1";	
		String actualCount = shp.getTextFromAddToCartBtn();
		
		Assert.assertEquals(actualCount, expectedCount);
		System.out.println("TC is Passed");
		System.out.println("went on home page");
	}
	}

