package javaScript_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import SeleiumTest.BaseClass;

public class JavaScript extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		JavascriptExecutor JS =(JavascriptExecutor)driver;
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		WebElement WE = driver.findElement(By.xpath("//button[id='alert']"));
		int X = WE.getLocation().getX();
		int Y = WE.getLocation().getY();
		JS.executeScript("window.scrollBy("+X+", "+Y+")");
		Thread.sleep(3000);
		WE.click();
		
		

	}

}
