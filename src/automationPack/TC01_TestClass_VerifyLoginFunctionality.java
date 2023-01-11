package automationPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_TestClass_VerifyLoginFunctionality 
{
	public static void main (String[]args) 
	{
		System.setProperty("webdriver.chrome.driver" ,
				"F:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println(" Browser is maximize");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get( "https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		LoginPage_POMClass lp=new LoginPage_POMClass(driver);
		lp.sendusername();
		System.out.println("Username is entered");
		
		lp.sendPassword();
	    System.out.println("Password is entered");
	    
	    lp.clickLoginBtn();
	    System.out.println("Clicked on login Button");
	    
	    //--homePage
	    System.out.println("Went on homePage");
	    
	    //--validation apply
	    System.out.println("Apply the validation");
	    
	    String givenTitle = "Swag Labs";   //PO/BA/dev		
		String actualTitle = driver.getTitle();
		
		if(givenTitle.equals(actualTitle))
		{
			System.out.println("Login Test is passed");
		}
		else
		{
			System.out.println("Login Test is failed");
		}
		
		
		//driver.quit();
		System.out.println("browser is closed");
		
		System.out.println("End of Program");


		
	}

}
