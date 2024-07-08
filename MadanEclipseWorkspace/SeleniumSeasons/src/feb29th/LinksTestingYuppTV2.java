package feb29th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTestingYuppTV2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yupptv.com/");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//*[@id=\"accordion\"]/div/div[3]"));
		
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		System.out.println("No of links in popular shows block are: "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
