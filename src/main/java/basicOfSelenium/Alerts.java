package basicOfSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
//		System.getProperty("WebDriver.Chrome.driver",".\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Alerts.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
//		driver.manage().window().maximize();
//		Thread.sleep(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
////		Thread.sleep(Duration.ofSeconds(5));
//		driver.switchTo().alert().accept();
////		Thread.sleep(Duration.ofSeconds(100));
//		System.out.println(driver.getTitle());

		tabmethod("Alert with Textbox");
		AlertTextbox();
	}

	public static void tabmethod(String text) {
		System.getProperty("WebDriver.Chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		List<WebElement> eachtab = driver.findElements(By.xpath("//ul[@class='nav nav-tabs nav-stacked']/li/a"));
		for (WebElement eachvalue : eachtab) {
			if (eachvalue.getText().equalsIgnoreCase(text)) {
				eachvalue.click();
			}
		}

	}

	public static void AlertOkCancelmethod() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

	public static void AlertTextbox() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

	}

}
