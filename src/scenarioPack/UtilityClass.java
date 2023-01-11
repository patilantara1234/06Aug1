package scenarioPack;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static void screenShotMethod(WebDriver driver,String name) throws IOException
	{
	Date currentdate=new Date();
	String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":","-");
	System.out.println(screenshotfilename);
	
	TakesScreenshot take=(TakesScreenshot)driver;
	File src=take.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Sai\\Desktop\\screenshotFolder"+screenshotfilename+".jpg");
	FileHandler.copy(src, dest);

	}
}



