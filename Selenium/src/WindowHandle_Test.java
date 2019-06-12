import java.util.Set;

import org.openqa.selenium.By;


import SeleiumTest.BaseClass;

public class WindowHandle_Test extends BaseClass {

	public static void main(String[] args) throws Exception 
	{
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String PH = driver.getWindowHandle();
		System.out.println("Parent Handle is" + PH );
		driver.findElement(By.id("button1")).click();
		driver.switchTo().window(PH);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[contains@onclick() = 'newMsgWin()']")).click();
		//driver.switchTo().window(PH);
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();;
		Set<String> NoWindow = driver.getWindowHandles();
		System.out.println("list of windows handle" + NoWindow);
		for (String wh : NoWindow) {
			
			System.out.println("Order of open windows" + wh);
		if(wh.equals(PH))
		{
			System.out.println("Closing parent browser" +PH);
		driver.close();	
		}
		}
		
		
		
		
	}

}
