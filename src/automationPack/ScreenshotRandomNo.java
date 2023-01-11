
package automationPack;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotRandomNo 
{
static WebDriver driver;
	
	public static void getScreenshotMehod() throws IOException
	{
		Random no=new Random();
		int num =no.nextInt(100);
		
		TakesScreenshot take=(TakesScreenshot)driver;
		File src=take.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Sai\\Desktop\\ScreenshotCollectionFolder"+num+".jpg");
		FileHandler.copy(src, dest);
		
	}
public static void main (String[]args) throws IOException, InterruptedException
{
	System.setProperty("webdriver.chrome.driver" ,
			"F:\\Selenium\\chromedriver.exe");
	
	 driver= new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println(" Browser is maximize");
	
	driver.get( "t ");
	System.out.println("URL is opened");
	Thread.sleep(3000);
	getScreenshotMehod();
	
	System.out.println("taken Screenshot");
	
	WebElement username=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	username.sendKeys("standard_user");
	System.out.println(" Enter Username");
	
	
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	System.out.println("Enter Password");

	
	WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/input"));
	login.click();
	
	System.out.println("Went on home page");
	Thread.sleep(3000);
	
	getScreenshotMehod();
	
	WebElement logoutIcon=driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
	logoutIcon.click();
	Thread.sleep(4000);
	getScreenshotMehod();
	
	WebElement logout=driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
	logout.click();
	Thread.sleep(4000);
	getScreenshotMehod();
	
	System.out.println("logout");	
}
}
