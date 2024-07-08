package mar1st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting5 {

	public static void main(String[] args) {
	
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				
				WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
				
				List<WebElement> allItems=new Select(dropdown).getOptions();
				
				System.out.println("No of items in the dropdown are: "+allItems.size());
				
				for(int i=0;i<allItems.size();i++)
				{
					System.out.println(allItems.get(i).getText());
				}
				
				driver.quit();


	}

}
