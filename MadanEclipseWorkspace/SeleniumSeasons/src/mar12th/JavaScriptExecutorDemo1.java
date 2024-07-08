package mar12th;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void javaScriptExecutorDemo1Test()
	{
		//driver.findElement(By.xpath("//a[text()='Sell on Pepperfry']")).click();
		/*
		try 
		{
			//code to click close the ad popups
			driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		*/
		WebElement e1=driver.findElement(By.xpath("//a[text()='Sell on Pepperfry']"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].click();",e1);
	}
	


	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
