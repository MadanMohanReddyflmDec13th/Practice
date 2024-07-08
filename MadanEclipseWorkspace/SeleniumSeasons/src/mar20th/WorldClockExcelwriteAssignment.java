/*
package mar20th;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorldClockExcelwriteAssignment {
	

	WebDriver driver;
	@BeforeMethod
	public void setUp() 
	{
	driver=new ChromeDriver();
	driver.get("https://www.timeanddate.com/worldclock/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void webTable1Test() throws IOException, InterruptedException
	{
		String part1="//table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
	
			
			FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Desktop\\Madan Java\\ExcelPractice.xlsx");
			XSSFWorkbook wb =new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheet("Sheet1");
			
			for(int i=0;i<36;i++)
			{
				
				for(int j=0;j<4;j++)
				{
					ws.createRow(i).createCell(j).setCellValue(

							(driver.findElement(By.xpath(part1+i+part2+j+part3)).getText())
					
				}
			}
			
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}

	public static void main(String[] args) {
		"C:\\Users\\HP\\Desktop\\Madan Java\\ExcelAssignment.xlsx"
	}
}

*/