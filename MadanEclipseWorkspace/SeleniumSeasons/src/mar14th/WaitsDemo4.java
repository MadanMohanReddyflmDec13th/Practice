package mar14th;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitsDemo4 {

	WebDriver driver;
	@BeforeMethod
	public void setUp() 
	{
	driver=new ChromeDriver();
	driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	
	@Test
	public void waitsTest() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
		FluentWait<WebDriver> mywait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
		                                 .pollingEvery(Duration.ofMillis(1000))
	                                     .ignoring(NoSuchElementException.class);
		
		mywait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[@id='spinner']"))));
		
		System.out.println(driver.findElement(By.xpath("//div[@class='screen']")).getText());
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
