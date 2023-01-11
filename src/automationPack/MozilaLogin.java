package automationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MozilaLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"F:/Selenium/chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://www.firefox.com/");
		
				Thread.sleep(3000);
		
		
		
	}

}
