package automationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:/Selenium/chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://www.facebook.com/");
		
//				Thread.sleep(3000);
//				WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//				username.sendKeys("8275354772");
//				System.out.println(" User Name is Enter");
//				Thread.sleep(3000);
//		
//				WebElement password=driver.findElement(By.xpath(" //*[@id=\"pass\"]"));
//				password.sendKeys("9766884998");
//                System.out.println("password is entered");
//				Thread.sleep(3000);
//		
//				WebElement login=driver.findElement(By.name("login"));
//				login.click();
	

//				WebElement forgotPassword = driver.findElement(By.partialLinkText("password?"));
				
//				forgotPassword.click();
				
				WebElement forgotPassword = driver.findElement(By.xpath("//*[@id=\\'forgot-password-link\\']"));
				forgotPassword.click();
				
				//*[@id=\'forgot-password-link\']
	}

}
