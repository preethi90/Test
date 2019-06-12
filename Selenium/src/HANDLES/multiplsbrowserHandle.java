package HANDLES;

import java.util.Set;

import SeleiumTest.BaseClass;

public class multiplsbrowserHandle extends BaseClass{
	
	void callNK() {

		driver.get("https://www.naukri.com/");
	}

	public static void main(String[] args) throws Exception  {
		
		multiplsbrowserHandle BH = new multiplsbrowserHandle();
		{
			BH.callNK();
			String PH = driver.getWindowHandle();
			System.out.println("Parent browser is " +PH);
			// TO LIST ALL WEBPAGES
			
			Set<String> AH = driver.getWindowHandles();
			System.out.println("no of browsers in the screen" +AH.size());
			
			//TO PRINT EACH HANDLE
			for(String NameH: AH)
			{
				driver.switchTo().window(NameH);
				System.out.println("Name of the windos handled" +NameH);
				System.out.println("Name of the browser" +driver.getTitle());
				driver.close();
				Thread.sleep(2000);
						
			}
			
				
			
		}
		
	}

}
