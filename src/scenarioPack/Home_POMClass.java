package scenarioPack;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Home_POMClass 
{
WebDriver driver;
Actions act;
Select s;



@FindBy(xpath="//a[@id='nav-link-accountList']")

WebElement settingButton;
public void movesettingButton()
{
	act.moveToElement(settingButton).build().perform();
//	act.click(settingButton).perform();
}

@FindBy(xpath="//a[@id='nav-item-signout']")
WebElement SignOut;

public void clickSignOut()
{
	 //act = new Actions(driver);
	act.moveToElement(SignOut).build().perform();
	act.click(SignOut).perform();
}

@FindBy(xpath="//input[@id='twotabsearchtextbox']")
WebElement searchBox;
public void sendsearchBox()
{
	searchBox.clear();
    act.sendKeys("iphone x");
    searchBox.click();
    act.click(searchBox).perform();
}

@FindBy(id="nav-search-submit-text")
WebElement searchCountinue;
public void clicksearchCountinue()
{
	//searchCountinue.clear();
    act.sendKeys("iphone x");
    searchCountinue.click();
    act.click(searchCountinue).perform();
}


@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[8]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
WebElement mobileCover;
public void clickmobileCover()
{
	//menWear.click();
	act.moveToElement(mobileCover).build().perform();
	act.click();
	act.click(mobileCover).perform();
}

//List<String> allPage2 = new ArrayList<String>(driver.getWindowHandles());		
////driver.switchTo().window(allPage.get(2));s

@FindBy(xpath="//*[@id=\"submit.add-to-cart-announce\"]")
WebElement addToCart;
public void clickaddToCart()
{
act.moveToElement(addToCart).build().perform();
addToCart.click();
act.click(addToCart).perform();
}

//@FindBy(xpath="//*[@id=\"comparison_add_to_cart_button\"]/span/input")
//WebElement addToCart;
//public void clickaddToCart()
//{
//act.moveToElement(addToCart).build().perform();
//addToCart.click();
//act.click(addToCart).perform();
//}

        public Home_POMClass(WebDriver driver) 
        {
        	this.driver=driver;
        	PageFactory.initElements(driver, this);
        	act = new Actions(driver);
        	//s=new Select(DropdownSignout);
        }
        
        
        
        
        
}
