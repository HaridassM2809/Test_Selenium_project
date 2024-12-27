package testNG_AnnotationsAndAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTestNgValidation {

	static WebDriver driver;
	@Test
	public static void titleValidation() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String reqTitle ="Facebook – log in or sign up";
		
		String webTitle = driver.getTitle();
		System.out.println(webTitle);
		
//		Assert.assertEquals(reqTitle, webTitle);
		
		//or
		if(!reqTitle.equalsIgnoreCase(webTitle)) {
			Assert.fail(reqTitle + " and "+webTitle+" are not same."); // it will fail the test case
		}
		
		
	}
	
	@Test
	public static void textValidation() {
		lanchBrowser("https://www.facebook.com/");
		String webText = driver.findElement(By.id("reg_pages_msg")).getText();

		String reqText = "Create a Page for a celebrity, brand or business";

		Assert.assertEquals(webText, reqText);
		System.out.println("Both text are matching");
	}
	public static void lanchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
