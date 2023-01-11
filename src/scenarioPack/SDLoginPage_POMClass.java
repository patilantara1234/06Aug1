package scenarioPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SDLoginPage_POMClass 
{
     WebDriver driver;
    Actions act;
	
	   
	   @FindBy(xpath="//input[@ID='user-name']")
	   private WebElement username;
	   public void sendusername()
	   {
		   username.sendKeys("standard_user"); 
	   }
	   
	   @FindBy(xpath="//input[@ID='password']")
	   private WebElement password;
	   public void sendpassword()
	   {
		   password.sendKeys("secret_sauce"); 
	   }
	 
	   @FindBy(xpath="//input[@id='login-button']")
	   private WebElement loginBtn;
	   public void clickloginBtn()
	   {
		   
		   act.click(loginBtn).perform(); 
	   }
	  
	  
		
	  SDLoginPage_POMClass(WebDriver driver)
	   {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
		  act=new Actions(driver);
		 
	   }
	   
	   
	   
}


