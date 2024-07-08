package apr3rd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploading {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://imgur.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		}
	
	@Test
	public void framesHandling2Test() throws InterruptedException, AWTException 
	{
		
		driver.findElement(By.xpath("//span[text()='New post']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Choose Photo')]/child::img ")).click();
		Thread.sleep(3000);
		
		//C:\Users\HP\Desktop\Madan Manual\Cucumber studio Dashboard.png
		String fileName = "C:\\Users\\HP\\Desktop\\Madan Manual\\Cucumber studio Dashboard.png";
		StringSelection stringselection =new StringSelection(fileName);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Clipboard clipboard=toolkit.getSystemClipboard();
		clipboard.setContents(stringselection, null);
		
		//Pasting copied content
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
		{
		Thread.sleep(3000);
		driver.quit();
		}

}
