package practicePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPractice 
{
	public static void main (String[] args) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", 
//				"F:/Selenium/chromedriver.exe");
//		
//		WebDriver driver =  new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(3000);
//		
//		
//		WebElement username=driver.findElement(By.id("email"));
//		username.sendKeys(" 8275354772");
//		
//		Thread.sleep(3000);
//		
//		
//		WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//		password.sendKeys("9766884998");
//		
//		Thread.sleep(3000);
//		
//		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
//		login.click();
//************************************************************		
//		WebElement forgotpassword=driver.findElement(By.linkText("Forgotten password?"));
//		forgotpassword.click ();
//	*******************************************************	
		//Flipkart login
//		System.setProperty("webdriver.chrome.driver", 
//				"F:/Selenium/chromedriver.exe");
//		
//		WebDriver driver =  new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(3000);
//		
//		
//		WebElement username=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
//		username.sendKeys(" 8275354772");
//		
//		Thread.sleep(3000);
//		
//		
//		WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
//		password.sendKeys("9766884998");
//		
//		Thread.sleep(3000);
//		
//		WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
//		login.click();
//		
//		///html/body/div[2]/div/div/div/div/div[2]/div/form/div[5]/button
//		
//		WebElement requestOTP=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[5]/button"));
//		 requestOTP.click();
//	*********************************************************	
	System.setProperty("webdriver.chrome.driver",
	"F:/Selenium/chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement username=driver.findElement(By.xpath(" /html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
	username.sendKeys("8275354772");
	
	
	
		
		
		
		
		
		
		
	}
}
