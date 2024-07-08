package feb13thassignments;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Desktop\\Madan Java\\MadanPrograms\\msedgedriver.exe");
		new EdgeDriver();
	}

}
