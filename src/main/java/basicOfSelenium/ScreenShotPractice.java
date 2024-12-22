package basicOfSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPractice {

	public static void main(String[] args) throws IOException {

		System.setProperty("Webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File ssimg = screenshot.getScreenshotAs(OutputType.FILE);

		LocalDateTime timeAndDate = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String datetime = formatter.format(timeAndDate);
		System.out.println(datetime);

		File imglocation = new File(".\\src\\test\\resources\\Screenshot\\" + datetime + ".jpeg");
		FileHandler.copy(ssimg, imglocation);

	}

}
