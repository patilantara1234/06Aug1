package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickScrollUpDown 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"F:/Selenium/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/buttons");
	
	Actions act=new Actions(driver);
	
	WebElement doubleClickBtn= driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
	act.moveToElement(doubleClickBtn).build().perform();
act.doubleClick(doubleClickBtn).perform();
	
	
//	WebElement rightClickBtn= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]"));
//	act.moveToElement(rightClickBtn).build().perform();
//	act.doubleClick(rightClickBtn).perform();
//	act.contextClick(rightClickBtn).perform();
	
	WebElement clickMe= driver.findElement(By.xpath("document.querySelector(\"#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3)\")"));
	act.moveToElement(clickMe).build().perform();
	act.doubleClick(clickMe).perform();
	
	
		
	
	
	
}
}
