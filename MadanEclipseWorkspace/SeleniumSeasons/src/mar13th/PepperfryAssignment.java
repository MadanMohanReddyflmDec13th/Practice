package mar13th;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PepperfryAssignment {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver =new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void pepperfryAssignmentTest() {
		
		String homeWindowId =driver.getWindowHandle();
		
		Set<String> allWinodwsIds=driver.getWindowHandles();
		
		driver.findElement(By.xpath("p[text()='Partner With Us']/parent::div"));
		driver.findElement(By.xpath("//a[text()='Sell on Pepperfry']")).click();
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		}
}

