package feb19th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDOBAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(5000);
		
		/* 1.Using Select method
		Select s1=new Select(driver.findElement(By.name("birthday_day")));
		s1.selectByIndex(25);

		Select s2=new Select(driver.findElement(By.name("birthday_month")));
		s2.selectByValue("9");
		
		Select s3=new Select(driver.findElement(By.name("birthday_year")));
		s3.selectByVisibleText("2000");
		*/
		
		// 2.Using SendKeys method
		driver.findElement(By.name("birthday_day")).sendKeys("26");
		driver.findElement(By.name("birthday_month")).sendKeys("Sep");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
