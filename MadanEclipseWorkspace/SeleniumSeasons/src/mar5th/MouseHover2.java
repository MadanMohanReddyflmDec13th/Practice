package mar5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover2 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.kvb.co.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void mouseHover2Test() 
	{
		//mouse hover code for chain of actions
		Actions act=new Actions(driver);
		/*
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Personal']"))).pause(3000)
		.moveToElement(driver.findElement(By.xpath("//a[text()='Investments ']"))).pause(3000)
		.build().perform();
		driver.findElement(By.xpath("//a[text()='Mutual Funds']")).click();
		*/
		
		//we can also clicked by using method click(WebElemet)
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Personal']"))).pause(3000)
		.moveToElement(driver.findElement(By.xpath("//a[text()='Investments ']"))).pause(3000)
		.click(driver.findElement(By.xpath("//a[text()='Mutual Funds']"))).pause(3000)
		.build().perform();
	}	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
