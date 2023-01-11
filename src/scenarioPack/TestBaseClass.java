package scenarioPack;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBaseClass 
{
	WebDriver driver;
	Logger log =Logger.getLogger("SwasDemo06AugBatch");
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
				{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Selenium\\chromedriver.exe");

		    driver=new ChromeDriver();
				}
		else
		{
			System.setProperty("webdriver.gecko.driver", 
					"F:\\Selenium\\geckodriver.exe");

			    driver=new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser is opened");
		
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		    driver.get("https://www.saucedemo.com/");
		    log.info("url open");
			
			driver.manage().window().maximize();
			log.info("Windows is maximize");
			
			SDLoginPage_POMClass slp=new SDLoginPage_POMClass(driver);
			
			slp.sendusername();
			log.info("Username is pass ");
			
			slp.sendpassword();
			log.info("Password is pass");
			
			slp.clickloginBtn();
			log.info("Click on login button");
			
			UtilityClass.screenShotMethod(driver, "homePage");
			log.info("Take a screenshot");
			
		    log.info("Went on home page");	
	}

	@AfterMethod
	public void tearDown()
	{
    driver.quit();
    log.info("Browser is closed");
    log.info("End of program");
	}
	
	
}
