package practicePack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction 
{
	

	@SuppressWarnings("unused")
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\\\Selenium\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	System.out.println("browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("Window is maximize");
	
	driver.get("https://www.flipkart.com/");
	System.out.println("url is open");
	
	WebElement username=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	username.sendKeys("8275354772");
	System.out.println(" Enter Username");
	Thread.sleep(1000);
	
	WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	password.sendKeys("9766884998");
	System.out.println("Enter Password");
	Thread.sleep(1000);
	
	WebElement login= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")); 
	
		Actions act = new Actions(driver);
		act.click(login).perform();
	
		Thread.sleep(3000);
//**********************************************************************
	 // //Account Logout	
//		WebElement myAccount= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]")); 
//		
//		act.moveToElement(myAccount).build().perform();
//		Actions act1 = new Actions(driver);
//		
//		Thread.sleep(3000);
//		
//        WebElement logout= driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[9]")); 
//        act.moveToElement(logout).build().perform();
//        act.click(logout).perform();
//******************************************************
		//Fashion
        
        WebElement fashion= driver.findElement(By.xpath(" //*[@id=\"container\"]/div/div[2]/div/div/div[3]")); 
		act.moveToElement(fashion).build().perform();
		Actions act2 = new Actions(driver);
		Thread.sleep(3000);
		
		WebElement WumenWestern = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[3]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[4]")); 
		act.moveToElement(WumenWestern).build().perform();
		Actions act3 = new Actions(driver);
		Thread.sleep(3000);
		
		
		WebElement PoloTshirt = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[3]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[4]")); 
		act.moveToElement(PoloTshirt).build().perform();
		act.click(PoloTshirt).perform();
		//Actions act4 = new Actions(driver);
		Thread.sleep(3000);
		
		List
		<String> allPage = new ArrayList<String>(driver.getWindowHandles());		
		driver.switchTo().window(allPage.get(1));

		WebElement prize = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[2]")); 
		act.moveToElement(prize).build().perform();
		act.click(prize).perform();
		
		Thread.sleep(3000);
		
		
		WebElement image = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div")); 
		act.moveToElement(image).build().perform();
		act.click(image).perform();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	/html/body/div/div/footer/div/div[1]/div/div[8]/a[4]
		//(//a[@class='_3CuAg8'])[4]
		//a[contains(text(),'Mens')]

		//a[contains(text(),'Men's T-Shirts')]
	
	
	
	//act.moveToElement(login).build().perform();
	
//	act.moveToElement(login).build().perform()
//	Actions act = new Actions(driver);
	
//	Actions act = new Actions(driver);
//	act.moveToElement(login).perform();
//	act.click(login).perform();
	
	
	}
}
