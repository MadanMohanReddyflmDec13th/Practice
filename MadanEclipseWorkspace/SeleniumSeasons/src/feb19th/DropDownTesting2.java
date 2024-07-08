package feb19th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("MadanReddy");
		
		driver.findElement(By.name("password")).sendKeys("Madan123");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("location")).sendKeys("sydney");
		
		driver.findElement(By.name("room_nos")).sendKeys("2 - Two");
		
		driver.findElement(By.name("adult_room")).sendKeys("3 - Three");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(3000);
		
		
		driver.quit();

	}

}
