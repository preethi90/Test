import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleiumTest.BaseClass;

public class testFrames extends BaseClass {

	public static void main(String[] args) {
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("IF1");
				WebElement WE = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Actions act = new Actions(driver);
		
	act.click(WE).sendKeys("preedsfhdfhj" +Keys.TAB).sendKeys("MDHFGRSEYG").build().perform();	/*.click(driver.findElement(By.id("sex-0")))*/
		driver.switchTo().frame(driver.findElement(By.id("IF2")));
	driver.getTitle();
	
		

	}

}
