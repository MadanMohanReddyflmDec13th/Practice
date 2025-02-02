package mar13th;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HighlightElement {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest() {

		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("MadanReddy");
		
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Madan123");
	
		//driver.findElement(By.xpath("//input[@name='login']")).click();
		
		findElement("//input[@name='username']").sendKeys("MadanReddy");
		
		findElement("//input[@name='password']").sendKeys("Madan123");
		
		findElement("//input[@name='login']").click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
	}
	
	private WebElement findElement(String xpath) {
		
		WebElement element=null;
		element=driver.findElement(By.xpath(xpath));
		

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		js.executeScript("arguments[0].style.border=''", element);
		
		return element;
		
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		}
}
