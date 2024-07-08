package feb13thassignments;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\Madan Java\\MadanPrograms\\geckodriver.exe");
		new FirefoxDriver();

	}

}
