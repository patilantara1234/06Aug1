package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementProgram1 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver",
//				"F:/Selenium/chromedriver.exe");
//
//				WebDriver driver =  new ChromeDriver();
//				driver.manage().window().maximize();
//
//				driver.get(" https://www.saucedemo.com/");
//		
//				Thread.sleep(3000);
//		
//		
//WebElement username = driver.findElement(By.id("user-name"));
//		username.sendKeys("standard_user");
//		
//		Thread.sleep(3000);
//	
//	WebElement password=driver.findElement(By.id("password"));
//	password.sendKeys("secret_sauce");
//	Thread.sleep(3000);
//	
//	WebElement loginBtn=driver.findElement(By.id("login-button"));
//	
//	loginBtn.click();
////	*****************************************************
//	WebElement user=driver.findElement(By.tagName("input"));
//	user.sendKeys("standard_user");
//	
//	WebElement user1= driver.findElement(By.name("user-name"));
//	user1.sendKeys("standard_user");
//	
//	WebElement user2 =driver.findElement(By.className("input error from input"));
//	user2.sendKeys("standard_user");
//	*******************************************************
	System.setProperty("webdriver.chrome.driver",
			"F:/Selenium/chromedriver.exe");

			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.facebook.com/");
	
			Thread.sleep(3000);
	
			//User<input type ="text"></input>|
			
			
WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("8275354772");
	
	Thread.sleep(3000);

WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("9766884998");

Thread.sleep(3000);

WebElement login=driver.findElement(By.name("login"));
login.click();
	
	
	}
	
	
	
	
	

	
	
}
