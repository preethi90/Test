package SeleiumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}

		public static WebDriver driver = new ChromeDriver();
		//public static WebDriver driver = new FirefoxDriver();
				
	     
	}
