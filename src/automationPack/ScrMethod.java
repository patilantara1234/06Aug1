package automationPack;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrMethod 
{
	static WebDriver driver;
	public static void getScreenshot1(String timeStamp) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("E:\\Software Class\\Automation\\Automation\\ScreenshotImagebyAuto\\"+ timeStamp +".jpg");
		FileHandler.copy(sourceFile, destFile);
	}
	public static void main(String[]args) throws IOException
	{
//		Calendar cal= Calendar.getInstance();
//		Date time=cal.getTime();
//		String timeStamp=time.toString().replace(";" , "").replace(" ","");
//		System.out.println("time");
//		System.out.println("timeStamp");
		
		
		System.setProperty("webdriver.chrome.driver" ,
				"F:\\Selenium\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		getScreenshot1("loginPage");
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.sendKeys("standard_user");
		System.out.println("Enter Username");
		
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		System.out.println("Enter Password");
	
		
		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/input"));
		login.click();
		
		System.out.println("Went on home page");
		
		getScreenshot1("homePage");
		
		
		
		
	}
		
	
}
