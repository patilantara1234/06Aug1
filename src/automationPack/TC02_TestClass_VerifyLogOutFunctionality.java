package automationPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_TestClass_VerifyLogOutFunctionality 
{
	public static void main(String[] args) 
	{
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

//click settingBtn and logOutBtn
HomePage_POMClass hp = new HomePage_POMClass(driver);
hp.clickSettingBtn();
System.out.println("Clicked on setting button");

hp.clickLogOutBtn();
System.out.println("Clicked on logOut button");

System.out.println("Went on loginPage");

System.out.println("Apply the validation");

String givenTitle = "Swag Labs";   //PO/BA/dev		
String actualTitle = driver.getTitle();

if(givenTitle.equals(actualTitle))
{
	System.out.println("LogOut Test is passed");
}
else
{
	System.out.println("LogOut Test is failed");
}


//driver.close();
System.out.println("browser is closed");

System.out.println("End of Program");





		
	}

}
