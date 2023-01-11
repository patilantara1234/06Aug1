package automationPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04_TestClass_VerifyAllProductsAddToCartFunctionality {

	public static void main(String[] args) 
	{
		//test steps
		System.setProperty("webdriver.chrome.driver" ,
				"F:\\Selenium\\chromedriver.exe");	
				
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
						
		driver.manage().window().maximize();	
	    System.out.println("browser is maximized");
								
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
						
		driver.get("https://www.saucedemo.com/");
		System.out.println("url is opened");
				
		//loginActivity
		LoginPage_POMClass lp = new LoginPage_POMClass(driver);
		lp.sendusername();
		System.out.println("Username is entered");
				
		lp.sendPassword();
		System.out.println("Password is entered");
				
		lp.clickLoginBtn();
		System.out.println("Clicked on login Button");
				
		//--homePage
		System.out.println("Went on homePage");
		
		
		HomePage_POMClass hp = new HomePage_POMClass(driver);
		hp.clickAllProductsAddToCart();
		
		System.out.println("Clicked on all products");
		
		System.out.println("Apply the validation");
	
		String expectedCount = "6";
		String actualCount = hp.getTextFromAddToCartBtn();
		
		if(expectedCount.equals(actualCount))
		{
			System.out.println("All product test case is passed");
		}
		else
		{
			System.out.println("All product test case is failed");
		}

		
			
		//driver.quit();
		System.out.println("browser is closed");
		
		System.out.println("End of Program");
		
		
	}

}
