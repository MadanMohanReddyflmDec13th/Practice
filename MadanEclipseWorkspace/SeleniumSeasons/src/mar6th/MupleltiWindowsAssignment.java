package mar6th;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MupleltiWindowsAssignment {

	WebDriver driver;

	@BeforeMethod
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
	}

	@Test
	public void multipleWindowsHandling1Test() throws InterruptedException 
	{

		String homeWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@alt='IRCTCofficial youtube']"));

		Set<String> allWindowIds = driver.getWindowHandles();

		for (String tempvar : allWindowIds) 
		{
			driver.switchTo().window(tempvar);

			// validation
			if (driver.getTitle().equalsIgnoreCase("IRCTC OFFICIAL - YouTube")) 
			{
				break;
			}

			System.out.println(driver.findElement(By.xpath("//div[@id='content' and @dir='auto']")).getText());

		}

		driver.switchTo().window(homeWindowId);

	}

	@AfterMethod
	public void teardown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
