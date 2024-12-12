package basicOfSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasic_Implicitly {
	
	static WebDriver driver ;
	public static void main (String []args) {
		System.getProperty("Webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		browserurl("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	}
	public static void browserurl(String url) {
		driver.get(url);
		
	}

}
