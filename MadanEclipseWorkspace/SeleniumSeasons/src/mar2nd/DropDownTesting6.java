package mar2nd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTesting6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		driver.manage().window().maximize();
		
		WebElement carsDropdown=driver.findElement(By.id("cars"));
		
		new Select(carsDropdown).selectByVisibleText("Volvo");
		
		Thread.sleep(3000);
		
		new Select(carsDropdown).selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		
		new Select(carsDropdown).deselectByVisibleText("Volvo");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
