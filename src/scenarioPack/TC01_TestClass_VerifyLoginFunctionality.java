package scenarioPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_TestClass_VerifyLoginFunctionality
{
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is Open");
		
		 //driver.manage().timeouts().implicitlyWait(Duration);
		
		 driver.get("https://www.amazon.com/ap/signin?ie=UTF8&clientContext=133-3929567-2771317&arb=984082f5-a5af-44db-b357-0189739fbebf&openid.pape.max_auth_age=0&use_global_authentication=false&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fonline-shopping%2Fs%3Fk%3Donline%2Bshopping%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    System.out.println("url is open");
	    
	    driver.manage().window().maximize();
	    System.out.println("browser is maximize");
	    
	    loginPage_POMClass lp=new loginPage_POMClass(driver);
	    
	    lp.sendmobileNumber();
	    System.out.println("entered mobile number");
	    
	    lp.clickcountinueBtn();
	    System.out.println(" click on countinue button");
	    
	    lp.sendpassword();
	    System.out.println(" Entered password");
	    
	    lp.clicksignIn();
	    System.out.println(" click on sign in button");
	    
//	    Alert alt = driver.switchTo().alert();
//	    alt.accept();
	    
	    System.out.println(" Went on Home Page");
	  
	    System.out.println(" Apply the validation");
	         
	    String givenTitle="Amazon.com : online shopping";
	    
        String actualTitle=driver.getTitle();

        String title = driver.getTitle();
        System.out.println("title is->"+title);

        
	    if (givenTitle.equals(actualTitle))
	    {
	    	System.out.println("Test case is passed");
	    }
	    else
	    {
	    	System.out.println("Test case is failed");
	    }
	    
//	    driver.quit();
//	    System.out.println("driver close");
	    System.out.println("end of program");
	    
	
	
	}
}
