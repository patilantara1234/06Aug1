package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcard 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"F:/Selenium/chromedriver.exe");

			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.saucedemo.com/");
	
			Thread.sleep(3000);
	
		
			
			
WebElement username = driver.findElement(By.id("inputEmail"));
	username.sendKeys("8275354772");
	
	Thread.sleep(3000);
	
//	WebElement login=driver.findElement(By.className("a-button-input"));
//	login.click();	
			
	
WebElement password=driver.findElement(By.id("inputPassword"));
password.sendKeys("9766884998");

Thread.sleep(3000);
//
//@SuppressWarnings("unused")
WebElement SIGNIN=driver.findElement(By.id("submitLogin"));
SIGNIN.click();	

//WebElement HomePage=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
//HomePage.sendKeys("bag");

//driver.get("https://www.flipkart.com/");	
//-->>/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input






//List<WebElement>search _suggestion =driver.findElements(By.xpath(null))
//for ( int i=0; i<search_suggestion.size()-1;i++)
//{
//	System.out.println(search_suggestion.get(1).getText(););

}
















}
	
}
