package scenarioPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_POMClass 
{
WebDriver driver;

@FindBy(xpath="//input[@id='ap_email']")
WebElement mobileNumber;
public void sendmobileNumber()
{
mobileNumber.sendKeys("8275354772");
}


@FindBy(xpath="//input[@id='continue']")
WebElement countinueBtn;
public void clickcountinueBtn()
{
countinueBtn.click();
}


@FindBy(xpath="//input[@id='ap_password']")
WebElement password;
public void sendpassword()
{
password.sendKeys("9766884998");
}

@FindBy(xpath="//input[@id='signInSubmit']")
WebElement signIn;
public void clicksignIn()
{
signIn.click();
}



public loginPage_POMClass (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}



}
