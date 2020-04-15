package commonactions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public RemoteWebDriver driver;

	@Parameters({"url"})
	@BeforeMethod
	public RemoteWebDriver launchBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
