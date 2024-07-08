package feb12th;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch2 {

	public static void main(String[] args) {
		
		
		//using selenium 3.14.159
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Madan Java\\MadanPrograms\\chromedriver-win64\\chromedriver.exe");
		new ChromeDriver();

	}

}
