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

public class ScreenshotMethod
{
	static WebDriver driver;
	public static void getScreenshot(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		File destFile = new File("E:\\Software Class\\Automation\\Automation\\ScreenshotImagebyAuto\\"+ name +".jpg");
		
		FileHandler.copy(sourceFile, destFile);
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver" ,
				"F:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println(" Browser is maximize");
		
		driver.get( "https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		//screenshotMethodCall 
		getScreenshot("loginPage");
		System.out.println(" get screenshot ");
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.sendKeys("standard_user");
		System.out.println(" Enter Username");
		
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		System.out.println("Enter Password");
	
		
		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/input"));
		login.click();
		
		System.out.println("Went on home page");
		//screenshotMethodCal
		getScreenshot("homePage");
		
		
	}

}
