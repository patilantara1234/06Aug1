package automationPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildClass
{
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	
	WebElement username = driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
			
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
			
	WebElement loginBtn = driver.findElement(By.id("login-button"));
	loginBtn.click();
WebElement bagEle=driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
bagEle.click();
List<WebElement>allProduct=driver.findElements(By.xpath("//button[text()='Add to cart']"));
	
	
	
	
	
	
	}
}
