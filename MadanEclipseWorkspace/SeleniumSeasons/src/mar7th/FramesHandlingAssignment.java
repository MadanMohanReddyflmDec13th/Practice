package mar7th;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesHandlingAssignment {



	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void framesHandlingAssignmentTest() throws InterruptedException {
		
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		Thread.sleep(3000);
		
		Set<String> allWindowsIds =driver.getWindowHandles();
		
		for(String tempvar:allWindowsIds)
		{
			driver.switchTo().window(tempvar);
			
			//validation
			if(driver.getTitle().equalsIgnoreCase("Selenium Live Project: FREE Real Time Project for Practice"))
			{
				break;
			}
		}
		Thread.sleep(3000);
		
		List<WebElement> allItems=driver.findElements(By.xpath("//span[@class='kt-blocks-info-box-title']"));
		System.out.println("No of courses: "+allItems.size());
		
		for(int i=0;i<allItems.size();i++) {
			
			System.out.println(allItems.get(i).getText());
		}
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		}
}
