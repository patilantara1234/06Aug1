package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:/Selenium/chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://www.gmail.com/");
		
				Thread.sleep(3000);
		
				//User<input type ="text"></input>|
				
				
	WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("patilantara123@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement next=driver.findElement(By.className("VfPpkd-RLmnJb"));
		next.click();	
				
		
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("ram");

	Thread.sleep(3000);

	WebElement login=driver.findElement(By.className("button"));
	login.click();	
		
		
	
		
		
	}
	
}
