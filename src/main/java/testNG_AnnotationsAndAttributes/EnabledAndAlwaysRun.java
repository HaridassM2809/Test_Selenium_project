package testNG_AnnotationsAndAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnabledAndAlwaysRun {

	static WebDriver driver;
	public static void browserLanch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test (enabled = false)
	public static void faceBooksite() {
		browserLanch();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test (alwaysRun = true )
	public static void youtubesite() {
		browserLanch();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
