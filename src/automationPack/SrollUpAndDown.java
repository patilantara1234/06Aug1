package automationPack;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollUpAndDown 
{
	public static void main (String[]args) throws InterruptedException
	{
	System.setProperty(" webdriver.chrome.driver", 
			"F:/Selenium/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	
//	driver.get("https://mdbootstrap.com/docs/standard/");
//	Thread.sleep(3000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//scroll down
	
	js.executeScript("window.scroll(0,1000)");
	Thread.sleep(9000);
	
	//scroll up 
	js.executeScript("window.scroll(0,-1000)");
	Thread.sleep(9000);
	
	
	}

}
