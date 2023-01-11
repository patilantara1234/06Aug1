package scenarioPack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonScenario 
{
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.drivar", 
				"F:\\\\Selenium\\\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		System.out.println("open webdriver");
		
	
	driver.manage().window().maximize();
	System.out.println(" window is maximize");
	
	driver.get("https://www.amazon.in/");
	System.out.println("open url");
	
	
	Actions act = new Actions(driver);
	WebElement AccSignIn= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div")); 
	act.moveToElement(AccSignIn).build().perform();
	
	System.out.println("Sign In logo are opened");
	//Thread.sleep(1000);
	
	
	WebElement SignIn=driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
	act.moveToElement(SignIn).build().perform();
	act.click(SignIn).perform();
	System.out.println("Click on sign in logo");
	//Thread.sleep(1000);
	
	WebElement username=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
	username.sendKeys("8275354772");
	System.out.println("click on username");
	//Thread.sleep(1000);
	
	WebElement countinue=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input"));
	countinue.click();
	//Thread.sleep(1000);
	
	
	WebElement signInPass= driver.findElement(By.className("a-button-input")); 
	act.moveToElement(signInPass).build().perform();
	act.click(signInPass).perform();
	System.out.println("countinue with password");
	//Thread.sleep(1000);
	
	
	WebElement password=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	password.sendKeys("9766884998");
	System.out.println("click on password");
	//Thread.sleep(1000);
	
	WebElement signIn=driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
	signIn.click();
	
	WebElement searchPage= driver.findElement(By.id("twotabsearchtextbox")); 
	
	
	searchPage.sendKeys("iphone x");
	act.click(searchPage).perform();
	
	 driver.findElement(By.id("nav-search-submit-text")).
	click();
	
	
	 WebElement mobile=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
	act.moveToElement(mobile).build().perform();
	act.click(mobile).perform();
	 
//	List<String> allPage2 = new ArrayList<String>(driver.getWindowHandles());		
//    driver.switchTo().window(allPage.get(2));
	
	
	WebElement addToCart=driver.findElement(By.className("a-button-input"));
	act.moveToElement(addToCart).build().perform();
	act.click(addToCart).perform();
	
	WebElement PCkOut=driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input"));
	act.moveToElement(PCkOut).build().perform();
	act.click(PCkOut).perform();
	
	WebElement AccSignInlogOut= driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/a[2]")); 
	act.moveToElement(AccSignInlogOut).build().perform();
	
	WebElement SignOut=driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
	act.moveToElement(SignOut).build().perform();
	act.click(SignOut).perform();
	System.out.println("logout");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
