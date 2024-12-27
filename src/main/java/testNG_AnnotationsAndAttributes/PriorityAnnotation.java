package testNG_AnnotationsAndAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityAnnotation {
	
	
	static WebDriver driver;
	public static void browserLanch() {
		System.getProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public static void faceBooksite() {
		browserLanch();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test (priority = 2 )
	public static void youtubesite() {
		browserLanch();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
