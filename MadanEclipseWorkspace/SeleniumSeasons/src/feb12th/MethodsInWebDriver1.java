package feb12th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//get(String):void
		
		driver.get("https://adactinhotelapp.com/");
		
		//close():void
		driver.close();
		
		
	}

}
