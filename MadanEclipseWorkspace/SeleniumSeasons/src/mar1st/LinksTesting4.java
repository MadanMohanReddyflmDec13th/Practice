package mar1st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));
		
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		System.out.println("No of Links in this Module "+allLinks.size());
		
		for(int i=0;i <allLinks.size();i++)
		{
			WebElement link=allLinks.get(i);
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			link.click();
			
			Thread.sleep(3000);
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().back();
			
			Thread.sleep(3000);
			
			//getting new Reference to avoid StaleElementRefernceException
			block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));
			allLinks=block.findElements(By.tagName("a"));
		}
		
		driver.quit();

	}

}
