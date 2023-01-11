package scenarioPack;

import org.testng.annotations.Test;

public class TestNG11 
{
	@Test
	public void Test1()
	{
	String expectedTitle="Swag Labs";
	String actualTitle="Labs";
	
	if(expectedTitle.equals(actualTitle))
			{
		System.out.println("Passed");
		
			}
	else
	{
		System.out.println("Failed");
	}
	}
	
		

}
