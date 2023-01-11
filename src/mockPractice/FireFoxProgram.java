package mockPractice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxProgram 
{
	public static void main (String[]args)
	{
		System.setProperty("webdriver.gecko.driver", 
				"F:\\Selenium\\mozila File\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.com");
		
	}
}
