package testNG_AnnotationsAndAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	
	static WebDriver driver;
	public static void browserLanch() {
		System.getProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test (invocationCount = 3)
	public static void faceBooksite() {
		browserLanch(); //getting this method from another class within same package
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}

}
