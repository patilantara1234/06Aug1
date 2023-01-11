package mockPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverProgram 
{
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver",
				"F:/Selenium/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}
}
