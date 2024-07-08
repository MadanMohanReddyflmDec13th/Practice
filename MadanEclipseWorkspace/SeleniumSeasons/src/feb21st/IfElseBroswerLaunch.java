package feb21st;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IfElseBroswerLaunch {

	public static void main(String[] args) {
		
		System.out.println("enter browser");
		Scanner input=new Scanner(System.in);
		String bro=input.next();
		
		if(bro.equalsIgnoreCase("chrome"))
		{
			new ChromeDriver();
		}
		else if(bro.equalsIgnoreCase("firefox"))
		{
			new FirefoxDriver();
		}
		else if(bro.equalsIgnoreCase("edge"))
		{
			new EdgeDriver();
		}
	}

}
