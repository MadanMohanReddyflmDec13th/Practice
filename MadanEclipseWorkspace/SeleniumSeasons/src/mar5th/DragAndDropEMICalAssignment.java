package mar5th;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	
	public class DragAndDropEMICalAssignment {
		
	WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			driver=new ChromeDriver();
			driver.get("https://emicalculator.net/");
			driver.manage().window().maximize();
		}
		
		@Test
		public void dragAndDropAssignmentTest() 
		{
			
			//driver.switchTo().frame(0); we haven't used it bcz no frames EMI calculator
			
			Actions act=new Actions(driver);
			
			act.dragAndDropBy(driver.findElement(By.xpath("(//span[@tabindex='0'])[1]")),80, 0).pause(3000)
			.dragAndDropBy(driver.findElement(By.xpath("(//span[@tabindex='0'])[2]")),150, 0).pause(3000)
			.dragAndDropBy(driver.findElement(By.xpath("(//span[@tabindex='0'])[3]")),-110, 0).pause(3000)
			.build().perform();
		}	
		
		@AfterMethod
		public void teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}
}
