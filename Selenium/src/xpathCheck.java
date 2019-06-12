import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[id='username']")).sendKeys("admin");
		driver.findElement(By.xpath)
		
		
	}

}
