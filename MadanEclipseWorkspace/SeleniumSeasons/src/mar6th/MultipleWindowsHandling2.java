
package mar6th;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MultipleWindowsHandling2 {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void multipleWindowsHandling2Test() throws InterruptedException{
	
		String homeWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'img/google-play')]")).click();
	
		switchTowindow("Not Found");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Cricbuzz");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		switchTowindow("TestFlight - Apple");
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		Thread.sleep(3000);
		
	}
	
	public void switchTowindow(String title) 
	{
		
		Set<String> allWindowsIds =driver.getWindowHandles();
		
		for(String tempvar:allWindowsIds)
		{
			driver.switchTo().window(tempvar);
			
			//validation
			if(driver.getTitle().equalsIgnoreCase(title))
			{
				break;
			}
		}
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		}
}