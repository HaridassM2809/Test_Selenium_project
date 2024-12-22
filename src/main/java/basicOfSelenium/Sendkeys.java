package basicOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) {
		System.getProperty("Webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Harish");
		driver.findElement(By.name("pass")).sendKeys("Rax");
		driver.findElement(By.xpath("//button [@type='submit']")).click();
		System.out.println(driver.getTitle());
	}

}
