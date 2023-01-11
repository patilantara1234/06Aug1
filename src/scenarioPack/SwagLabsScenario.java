package scenarioPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwagLabsScenario 
{
	public static void main (String[]args) throws InterruptedException
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
		
		System.out.println(" Apply Validation");
		
		String givenTytle= "Swag Labs";
		String actualTitle=driver.getTitle();
		
		if(givenTytle.equals(actualTitle))
		{
			System.out.println("Test Case is pass");
		}
		
		else
		{
		System.out.println(" Test Case is Fail");
		}
		WebElement logout=driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		logout.click();
		
		Actions act = new Actions(driver);
		WebElement logout1 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")); 
		act.moveToElement(logout1).build().perform();
		act.click(logout1).perform();
		

		
		
		//driver.close();
		System.out.println("Browser is closed ");
		
	}
}
