package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
			"F:/Selenium/chromedriver.exe");

			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fap%2Fcnep%3Fie%3DUTF8%26orig_return_to%3Dhttps%253A%252F%252Fwww.amazon.in%252Fyour-account%26openid.assoc_handle%3Dinflex%26pageId%3Dinflex&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
			Thread.sleep(3000);
			
			WebElement username = driver.findElement(By.id("ap_email"));
			username.sendKeys("8275354772");
			
			Thread.sleep(3000);
			WebElement countinue=driver.findElement(By.className("a-button-input"));
			countinue.click();	
	
			WebElement password=driver.findElement(By.id("ap_password"));
			password.sendKeys("Antara@123");
			
			WebElement login=driver.findElement(By.className("a-button-input"));
			login.click();
			driver.get("https://www.amazon.com/");
}
	
}
