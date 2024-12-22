package basicOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebManagerpractice {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
	}

}
