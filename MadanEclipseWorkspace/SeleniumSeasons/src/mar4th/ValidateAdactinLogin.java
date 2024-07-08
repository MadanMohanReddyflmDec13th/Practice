package mar4th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateAdactinLogin {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() 
	{
	driver= new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
	}
	
	@Test
	public void validateAdactinLoginTest1()
	{
		
		driver.findElement(By.name("username")).sendKeys("MadanReddy");
		driver.findElement(By.name("password")).sendKeys("Madan123");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Search Hotel");
	
	}
	
	@Test
	public void validateAdactinLoginTest2()
	{
		driver.findElement(By.name("username")).sendKeys("MadanReddy");
		driver.findElement(By.name("password")).sendKeys("Madan111");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
	}
	
	@Test
	public void validateAdactinLoginTest3()
	{
		driver.findElement(By.name("username")).sendKeys("Madan");
		driver.findElement(By.name("password")).sendKeys("Madan123");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
	}
	
	@Test
	public void validateAdactinLoginTest4()
	{
		driver.findElement(By.name("username")).sendKeys("Madan");
		driver.findElement(By.name("password")).sendKeys("Madan111");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System");
	}
	

}
