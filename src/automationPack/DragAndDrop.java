package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"F:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act=new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
	Thread.sleep(6000);
		WebElement desti=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
	
	    act.dragAndDrop(source, desti).perform();
	
	}

}
