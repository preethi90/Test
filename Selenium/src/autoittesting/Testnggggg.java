package autoittesting;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnggggg {

	@BeforeTest
	
	public void beforeMethod()
	{
		Reporter.log("beforeTest", true);
	}

@BeforeSuite
	
	public void beforesuite()
	{
		Reporter.log("before Suite", true);
	}
@Test

public void test()
{
	Reporter.log("test", true);
}
}

