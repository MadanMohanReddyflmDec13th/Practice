package mar11th;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertAssignment {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void AlertHandlingTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr266311");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678@");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).submit();
		
		/*
		Set<String> allWindowsIds =driver.getWindowHandles();
		
		for(String tempvar:allWindowsIds)
		{
			driver.switchTo().window(tempvar);
			
			//validation
			if(driver.getTitle().equalsIgnoreCase(" Guru99 Bank Manager HomePage "))
			{
				break;
			}
		}
		
		Thread.sleep(3000);
		*/
		

		
		try 
		{
			driver.findElement(By.xpath("//*[@fill='#5F6368']")).click();
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("32123132");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		Thread.sleep(3000);
		
		Alert al=driver.switchTo().alert();
		Assert.assertEquals(al.getText(),"Do you really want to delete this Customer?");
		al.accept();
		
		Thread.sleep(3000);
		
		Alert al2=driver.switchTo().alert();
		Assert.assertEquals(al2.getText(),"Customer does not exist!!");
		al2.accept();
		
		Thread.sleep(3000);
		
		
		/*
		try 
		{
			driver.findElement(By.xpath("//*[@fill='#5F6368']")).click();
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		*/
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
		}

}
