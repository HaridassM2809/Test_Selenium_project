package basicOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//h4[contains (text(), 'Web UI and Rest API')]"));
		jse.executeScript("arguments[0].scrollIntoView();", element);
	}

}

