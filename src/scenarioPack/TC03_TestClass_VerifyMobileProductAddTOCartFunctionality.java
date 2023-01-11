package scenarioPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03_TestClass_VerifyMobileProductAddTOCartFunctionality 
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
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    loginPage_POMClass lp=new loginPage_POMClass(driver);
	    
	    lp.sendmobileNumber();
	    System.out.println("entered mobile number");
	    
	    lp.clickcountinueBtn();
	    System.out.println(" click on countinue button");
	    
	    lp.sendpassword();
	    System.out.println(" Entered password");
	    
	    lp.clicksignIn();
	    System.out.println(" click on sign in button");
	    
	    Home_POMClass hpc=new Home_POMClass(driver);
	    
        hpc.sendsearchBox();
        
        System.out.println("Search brother printer");
        hpc.clicksearchCountinue();
        System.out.println("clicksearchCountinue");
        
        hpc.clickmobileCover();
        System.out.println("clickmobileCover");
        
        hpc.clickaddToCart();
        System.out.println("adddTocart");
//        hpc.clickmenWear();
//        System.out.println("click on all in one brother printer");
	    
//        hpc.clickshoes();
//        System.out.println("Select shoes");
//        
//        hpc.clickshoesSize();
//        System.out.println("Select shoesSize()");
        
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
