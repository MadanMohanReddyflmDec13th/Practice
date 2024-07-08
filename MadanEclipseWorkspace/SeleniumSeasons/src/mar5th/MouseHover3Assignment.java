package mar5th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover3Assignment {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver =new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void mouseHoverAssignment3Test(){
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"))).pause(3000)
		.moveToElement(driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"))).click()
		.pause(3000).build().perform();
		
		List<WebElement> allItems=driver.findElements(By.xpath("//button[@aria-label='Add to Cart']"));
		
		System.out.println("No of items are: "+allItems.size());
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		}

}
