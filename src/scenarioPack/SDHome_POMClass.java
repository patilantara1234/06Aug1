package scenarioPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SDHome_POMClass 
{
	  WebDriver driver;
	 Select s;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingBtn;
	public void clicksettingBtn()
	{
		settingBtn.click();
	}

	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOut;
	public void clicklogOut()
	{
		logOut.click();
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagProductaddToCartBtn;
	
	public void clickBagProductAddTOCart()
	{
		bagProductaddToCartBtn.click();
	}

//	@FindBy(xpath="//a[@class='shopping_cart_link']")
//	private WebElement addToCart;
//	
//	public String getTextFromclickaddToCart()
//	{
//		//addToCart.click();
//		String productCount= addToCart.getText();
//		return productCount;

	//}
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement addToCartBtn;
	
	public String getTextFromAddToCartBtn()
	{
		String productCount= addToCartBtn.getText();
		return productCount;
	}

	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropDown;
	public void clickdropDown()
	{
		dropDown.click();
		s.selectByValue("select of element");
		
	}
	

	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allProduct;
	public void clickallProduct()
	{
		for( WebElement addToCart:allProduct)
		{
			addToCart.click();
		}
	}
	
	
	
	SDHome_POMClass(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 s=new Select(dropDown);
	}



	
	}









