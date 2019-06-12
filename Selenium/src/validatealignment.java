import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatealignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement we = driver.findElement(By.id("email"));
		int x = we.getLocation().getX();
		int height = we.getSize().getHeight();
		int weight = we.getSize().getWidth();
		WebElement we1 = driver.findElement(By.id("pass"));
		int x1 = we1.getLocation().getX();
		int height1 = we1.getSize().getHeight();
		int weight1 = we1.getSize().getWidth();
		
		if(x==x1 && height==height1 && weight==weight1) 
		{
			System.out.println("The size is same");
		}
			else
			{
				System.out.println("Size is not aligned");
				
		}
	}

}
