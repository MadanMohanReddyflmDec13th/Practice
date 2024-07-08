package mar12th;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo2 {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://candymapper.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void javaScriptExecutorDemo2Test()
	{
		
		try 
		{
			driver.findElement(By.xpath("//*[@id='popup-widget46014-close-icon']"));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	


	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
