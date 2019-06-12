package takescreenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import SeleiumTest.BaseClass;

public class screenshot extends BaseClass {

	public static void main(String[] args) throws Exception 
	
	{
	
	driver.get("https://www.facebook.com/");

	System.out.println("The title of the page is" +driver.getTitle()); 
	System.out.println("the URL of the page is" +driver.getCurrentUrl());
	//System.out.println("the page source of the page is" +driver.getPageSource());
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	
	File desfile = new File("C:\\Users\\mohania87\\eclipse-workspace\\Selenium\\ScreenShots.png");
	
	Files.copy(srcfile,desfile);
	driver.close();
	
	}
}
