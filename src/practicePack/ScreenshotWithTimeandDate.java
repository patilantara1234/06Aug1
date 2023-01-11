package practicePack;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

@SuppressWarnings("unused")
public class ScreenshotWithTimeandDate
{
	public static void main(String[]args) throws IOException, InterruptedException
	{
		//1)Screen shot with date and time:-

	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://www.google.com/"); 			//launch Url
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement popup=driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a"));
			popup.click();										//click to popup window
			
			
			//to print date and time on sreenshot name
			
			LocalDateTime ltd=LocalDateTime.now();
			String DT=ltd.toString().replace(":", "-").replace(" ","");
			Thread.sleep(3000);
			
			TakesScreenshot take=(TakesScreenshot)driver;
			File src=take.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Sai\\Desktop\\screenshotFolder"+DT+".jpg");
			FileHandler.copy(src, dest);
			//Thread.sleep(3000);

		



	}

}
