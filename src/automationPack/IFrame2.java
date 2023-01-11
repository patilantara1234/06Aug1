package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrame2 
{
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:/Selenium/chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//we need to switch to frame ele
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='frame3']"));	
		driver.switchTo().frame(frameEle);
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		dropDown.click();
		
//		Select s = new Select(dropDown);
//		
//		s.selectByValue(babycat");
		
		System.out.println("end of program");
	
	}

}
