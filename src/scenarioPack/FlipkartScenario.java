package scenarioPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartScenario 
{
	private static final WebElement Logout = null;
	private static WebElement myAccount;

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver" ,
			"F:\\Selenium\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println(" Browser is maximize");
	
	driver.get( "https://www.flipkart.com/");
	System.out.println("URL is opened");
	Thread.sleep(1000);
	
//	WebElement loginPopUp=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
//	loginPopUp.click();
//	
//	
//	WebElement countinueBtn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
//	countinueBtn.click();
	
	WebElement username=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	username.sendKeys("8275354772");
	System.out.println(" Enter Username");
	Thread.sleep(1000);
	
	WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	password.sendKeys("9766884998");
	System.out.println("Enter Password");
	Thread.sleep(1000);
	
	
	WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
	login.click();
	System.out.println("Click on login button");
	Thread.sleep(1000);
	
	driver.findElement(By.name("q")).sendKeys("mobile");
	
	WebElement search=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
	search.click();
	Thread.sleep(1000);
	
//	act.moveToElement(fashionElement).perform();
//	Actions act = new Actions(driver);
//	act.click(Logout).perform();
	
//	Actions act =new Actions(driver);
//	act.moveToElement(myAccount).perform();
//	
//	act.click(myAccount).perform();
	
	
//	WebElement myAccount=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]"));
//	myAccount.click();
//	Thread.sleep(1000);
	
//	Actions act = new Actions(driver);
//	act.moveToElement(fashionEle).perform()
//
//     act.click(mensTshirt).perform();

	
	
	List<WebElement> search_suggestion =driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]"));
			for ( int i=0; i<search_suggestion.size()-1;i++)
			{
				System.out.println(search_suggestion.get(1).getText());
			}
	
	
	
	System.out.println("Went on home page");
	
	System.out.println(" Apply Validation");
	
	String givenTytle= "flipkart";
	String actualTitle=driver.getTitle();
	
	if(givenTytle.equals(actualTitle))
	{
		System.out.println("Test Case is pass");
	}
	
	else
	{
	System.out.println(" Test Case is Fail");
	}
//	
//	driver.close();
//	System.out.println("Browser is closed ");
	
}

}
