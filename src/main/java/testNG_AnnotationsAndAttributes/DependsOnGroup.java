package testNG_AnnotationsAndAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnGroup {
	
	static WebDriver driver;
	public static void browserLanch() {
		System.getProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(groups = { "groupA" })
	public void group1() {
		System.out.println(1 / 0);
	}
	
	@Test (groups = { "groupB" })
	public static void faceBooksite() {
		browserLanch();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dependsOnGroups = { "groupA", "groupB" })
	public static void googleSite() {
		browserLanch();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dependsOnGroups = "groupA")
	public void group2and3() {
		System.out.println("I am belongs to group2and3");
	}
	
	@Test(dependsOnGroups = "groupA", alwaysRun = true)
	public static void youtubesite() {
		browserLanch();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
