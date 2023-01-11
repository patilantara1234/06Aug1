package scenarioPack;

import org.testng.annotations.Test;

public class TestNG5 
{
	@Test(priority=-1)
	public void TestA()
	{
		System.out.println("Test-A");
	}

	@Test(priority=2)
	public void TestB()
	{
		System.out.println("Test-3");
		
	}
	@Test(priority=0)
	public void TestC()
	{
		System.out.println("Test-C");
		
	}
	
	@Test(priority=2)
	public void TestD()
	{
		System.out.println("Test-D");
		
	}
	@Test
	public void TestE()
	{
		System.out.println("Test-E");
		
	}
	
	
}
