package testNG_AnnotationsAndAttributes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
	WebDriver driver;
	
	@Parameters({"browser1"})
	@Test
	public void launchBrowser(String browser) {
		
//		browser = browser.toLowerCase();
		switch(browser.toLowerCase()){
			case "chrome":
				System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "edge":
				System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
				driver = new EdgeDriver();
				break;
		}
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Parameters({"aParameter", "bParameter"})
	@Test
	public void methoWithParameter(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	

}
