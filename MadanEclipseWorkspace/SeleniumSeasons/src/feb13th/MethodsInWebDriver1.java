package feb13th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		//manage
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		
		//getTitle
		System.out.println(driver.getTitle());
		
		//getCurrentUrl
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle
		System.out.println(driver.getWindowHandle());
		
		//getWindowHandles
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(3000);
		
		//close 
		//driver.close();
		
		
		//quit
		driver.quit();
		

	}

}
