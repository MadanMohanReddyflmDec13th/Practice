package feb19th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTesting3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(drop);
		//s1.selectByIndex(11);
		//s1.selectByValue("search-alias=electronics");
		s1.selectByVisibleText("Jewellery");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
