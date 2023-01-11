package scenarioPack;

import org.testng.annotations.Test;
@Test(priority=2)
public class TestNG6 
{
	public void TestA()
	{
		System.out.println("Test-A");
	}
	
  @Test(enabled=false,priority=1)
  public void TestB()
{
	System.out.println("Test-B");
	
}
  @Test
public void TestC()
{
	System.out.println("Test-C");
}





}
