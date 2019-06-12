package Testmouseandkeyboard;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import SeleiumTest.BaseClass;

public class Mouse_Keyboard_Movement extends BaseClass {

	public static void main(String[] args) throws Exception{
		
		driver.get("https://actitime.jmr.co.za/actitime/login.do");
		WebElement WE = driver.findElement(By.name("username"));
		Robot r = new Robot();
	WE.sendKeys("admin");
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DELETE);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_DELETE);
WebElement WE1 =  driver.findElement(By.name("pwd"));
Point p = WE1.getLocation();
System.out.println("Print" +p);
System.out.println("tHE x COORD IS " +p.getX());
System.out.println("THE y COORD IS" +p.getY());
r.mouseMove(p.getY(), p.getY());
WE1.sendKeys("ZSJDFUGHDBNZ");
WebElement WE2 = driver.findElement(By.cssSelector("input[type = 'submit']"));
WE2.click();
Thread.sleep(2000);

		
		
		

	}

}
