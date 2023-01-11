package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandle 
{
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver ", 
				"F:/Selenium/chromedriver.exe");
		System.out.println("open url");
		
	WebDriver driver=new ChromeDriver();
	
	
	driver.manage().window().maximize();
	System.out.println(" window is maximize");
	
	//driver.get("https://the-internet.herokuapp.com/key_presses");
	driver.get("https://www.amazon.in/");
	WebElement TextBox=driver.findElement(By.xpath(" //*[@id=\"twotabsearchtextbox\"]"));
	
	Actions action=new Actions(driver);
	WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	action.sendKeys("A").perform();
	action.click(TextBox);   
	action.click(TextBox).perform(); 
	Thread.sleep(3000);
	
	WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	searchBox.clear();
	searchBox.sendKeys("B");

	action.sendKeys("K");
	action.click(TextBox);   
	action.click(TextBox).perform(); 
	Thread.sleep(3000);
	
	action.sendKeys(Keys.ALT).perform();
	Thread.sleep(3000);
	
	action.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(3000);
	
	action.keyDown(Keys.CONTROL).sendKeys("S").keyUp(Keys.CONTROL).perform();
	action.click(TextBox);   
	action.click(TextBox).perform(); 
	Thread.sleep(3000);
	
	action.keyDown(Keys.CONTROL).sendKeys("M").keyUp(Keys.CONTROL).perform();
	action.click(TextBox);   
	action.click(TextBox).perform(); 

	
	}

}
