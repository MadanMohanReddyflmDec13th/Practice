package feb29th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		WebElement block = driver.findElement(By.xpath("/html/body/footer/div/div/div[1]"));

		List<WebElement> allLinks = block.findElements(By.tagName("a"));

		System.out.println("No of Links in this Module " + allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) 
		{
			System.out.println(allLinks.get(i).getText());
		}

		Thread.sleep(3000);

		driver.quit();

	}

}
