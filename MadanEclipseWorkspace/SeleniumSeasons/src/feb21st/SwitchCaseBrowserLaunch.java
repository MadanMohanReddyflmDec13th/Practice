package feb21st;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchCaseBrowserLaunch {

	public static void main(String[] args) {
		

		System.out.println("enter browser");
		Scanner input=new Scanner(System.in);
		String bro=input.next();
		
		switch(bro)
		{
		case "chrome":
			new ChromeDriver();
			break;
		
		case "firefox":
			new FirefoxDriver();
			break;
			
		case "edge":
			new EdgeDriver();
		}

	}

}
