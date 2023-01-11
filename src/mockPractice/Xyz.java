package mockPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xyz {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.gecko.driver", 
				"F:\\Selenium\\MozilaDriver\\geckodriver.exe");
		
		WebDriver ap=new FirefoxDriver();
		ap.get("https://www.saucedemo.com/");

	}
}
