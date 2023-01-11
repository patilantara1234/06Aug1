package automationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POMClass 
{
WebDriver driver;

@FindBy(xpath="//input[@id='user-name']")
WebElement username;

@FindBy(xpath="//input[@id='password']")
WebElement password;


@FindBy(xpath = "//input[@id='login-button']")
WebElement loginBtn;

public void sendusername()
{
	username.sendKeys("standard_user");	
}
public void sendPassword()
{
	password.sendKeys("secret_sauce");
}
	
public void clickLoginBtn()
{
	loginBtn.click();
}
	public LoginPage_POMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
}
