package automationPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POMClass 
{
	WebDriver driver;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement settingBtn;
	
	public void clickSettingBtn()
	{
		settingBtn.click();
	}
		 
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logOutBtn;
	
	public void clickLogOutBtn()
	{
		logOutBtn.click();
	}
	
	//bag products elements
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement bagProductaddToCartBtn;
	
	public void clickBagProductAddTOCart()
	{
		bagProductaddToCartBtn.click();
	}
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	List<WebElement> AllProduct;
	
	public void clickAllProduct()
	{
		
		
		for(WebElement AddToCart: AllProduct)
		{
			AddToCart.click();
		}
	}
	
	
	public HomePage_POMClass (WebDriver driver)
    {
    this.driver = driver;		 
	PageFactory.initElements(driver, this);
    }
	
	


}
