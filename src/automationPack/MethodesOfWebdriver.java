package automationPack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodesOfWebdriver 
{
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println("URL is opened by driver.navigate().to Method");
		
		driver.manage().window().maximize();
		System.out.println(" window is maximize");
		Thread.sleep(3000);
		
//		driver.manage().window().minimize();
//		System.out.println(" window is minimize");
//		Thread.sleep(3000);
		
		
		driver.navigate().back();
		System.out.println(" back command");
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println(" forward command");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		System.out.println(" refresh Command");
		Thread.sleep(3000);
	
	driver.getCurrentUrl();
	System.out.println(" get current url");
	
	driver.getTitle();
	System.out.println("get title");
	
	Dimension d=new Dimension(300,500);
	driver.manage().window().setSize(d);
	
	//setPosition();
	
	Point p = new Point(300,500);
	driver.manage().window().setPosition(p);
	
	String title = driver.getTitle();
	System.out.println("title is->"+title);
	String url = driver.getCurrentUrl();   
	System.out.println("url is ->"+url);
	
	
//	driver.close();
//	driver.quit();
//	System.out.println(" browser is close and quite");
	
	//input[contains(@class,'input_error form_input')]
	
	
	}
}
