package scenarioPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookScenario 
{
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver" ,
				"F:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println(" Browser is maximize");
		
		driver.get( "https://www.facebook.com/");
		System.out.println("URL is opened");
		Thread.sleep(3000);
		
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("8275354772");
		System.out.println(" Enter Username");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("9766884998");
		System.out.println("Enter Password");
		Thread.sleep(3000);
		
		WebElement loginBtn=driver.findElement(By.name("login"));
		loginBtn.click();
		System.out.println("Click on login button");
		Thread.sleep(3000);
		
//		WebElement countinueBtn=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/div/div[3]/div[1]/button"));
//		countinueBtn.click();
//		System.out.println("Click on Countinue button");
//		Thread.sleep(3000);
		
//		WebElement thiswasme=driver.findElement(By.xpath("//*[@id=\"checkpointSubmitButton\"]"));
//		thiswasme.click();
//		System.out.println("Click on this was me button");
//		Thread.sleep(12000);
		
//		WebElement countinue1=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/div/div[3]/div[1]/button"));
//		countinue1.click();
//		System.out.println("Click on browser countinue button");
//		Thread.sleep(3000);
		
		WebElement logoutBtn=driver.findElement(By.xpath("//*[@id=\"mount_0_0_74\"]/div[1]/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span"));
		logoutBtn.click();
		System.out.println("Click on log out button");
		Thread.sleep(3000);
		
		System.out.println("Went on home page");
		
		System.out.println(" Apply Validation");
		
		String givenTytle= "facebook";
		String actualTitle=driver.getTitle();
		
		if(givenTytle.equals(actualTitle))
		{
			System.out.println("Test Case is pass");
		}
		
		else
		{
		System.out.println(" Test Case is Fail");
		}
		
		//driver.close();
		//System.out.println("Browser is closed ");
		
	}

}
