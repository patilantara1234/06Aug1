package scenarioPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SDTC_04_TestClass_verifyBagProductAddToFunctionality extends TestBaseClass
{
	@Test
	public void verifyBagProductAddToFunctionality() 
	{
			SDHome_POMClass shp=new SDHome_POMClass(driver);
			shp.clickallProduct();
			//shp.getTextFromAddToCartBtn();
			System.out.println("click on single add to cart");
			
            System.out.println("All product add to cart");

			System.out.println("Apply validation");
	
			String expectedCount="6";
		    //String actualCount= shp.get TextFrom clickaddToCart();
			
			String actualCount=shp.getTextFromAddToCartBtn();
		   
		   Assert.assertEquals(actualCount,expectedCount);
           System.out.println("TC is passed");
	}
}	
		   
