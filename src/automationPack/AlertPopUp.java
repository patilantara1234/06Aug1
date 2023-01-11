package automationPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver" ,
				"F:\\Selenium\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		
		WebElement clickMe1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickMe1.click();
		Thread.sleep(5000);
		System.out.println("click on button or goes to page");
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(5000);
		System.out.println("alert action is conform");
		
		WebElement clickMe2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickMe2.click();
		Thread.sleep(5000);
		
		System.out.println("click on button or goes to page2");
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(5000);
		System.out.println("alert action is perform");
		

		
		
	}

}
