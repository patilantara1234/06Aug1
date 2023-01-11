package automationPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
public static void main (String[]args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver" ,
			"F:\\Selenium\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println(" Browser is maximize");
	
	driver.get( "https://www.saucedemo.com/");
	System.out.println("URL is opened");
	Thread.sleep(3000);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);

	File destFile = new File("E:\\Software Class\\Automation\\Automation\\ScreenshotImagebyAuto\\loginPage.jpg");
	
	FileHandler.copy(sourceFile, destFile);
	System.out.println("loginPage Screenshot is taken");
	
	
	WebElement username=driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	System.out.println(" Enter Username");
	Thread.sleep(3000);
	
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	System.out.println("Enter Password");
	Thread.sleep(3000);
	
	WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/input"));
	login.click();
	System.out.println("Click on login button");
	Thread.sleep(3000);
	
	System.out.println("Went on home page");
	
	
	
	File sourceFile1 = ts.getScreenshotAs(OutputType.FILE);

	File destFile1 = new File("E:\\Software Class\\Automation\\Automation\\ScreenshotImagebyAuto\\homePage.jpg");
	
	FileHandler.copy(sourceFile1, destFile1);
	System.out.println("homePage Screenshot is taken");
	
	System.out.println("Apply the validation");
	
	
	
	String givenTitle = "Swag Labs";
	
	String actualTitle = driver.getTitle();
	
	if(givenTitle.equals(actualTitle))
	{
		System.out.println("TC is passed");
	}
	else
	{
		System.out.println("TC is failed");
	}
	driver.close();
	System.out.println("Browser is closed");

}
}
