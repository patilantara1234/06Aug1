package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicAbsoluteRelative 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"F:/Selenium/chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://www.instagram.com/");
		
				Thread.sleep(3000);	
				
				WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
				username.sendKeys("8275354772");
				Thread.sleep(3000);
				
				WebElement password=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
				password.sendKeys("97668");
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
