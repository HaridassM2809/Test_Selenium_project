package basicOfSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Basic {
	static WebDriver driver;

	public static void main(String[] args) {
//		 testMthd(); 
		switchWindow();

	}

	public static void testMthd() {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\Test_Selenium_project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

//		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
//		driver.quit();
		System.out.println(System.getProperty("user.dir"));
		System.getProperty("Webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://youtube.com/");
		System.out.println(driver.getTitle());
//		driver.quit(); //this will close insta chrome window

//		System.setProperty("Webdriver.edge.driver","C:\\Users\\Admin\\git\\Test_Selenium_project\\Driver\\msedgedriver.exe");
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
		System.out.println(driver.getWindowHandle());
	}

	public static void switchWindow() {
		System.setProperty("Webdriver.chrome.driver", ".\\Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Open Multiple Windows')]")).click();
		System.out.println(driver.getTitle());
		String ParentWindHndl = driver.getWindowHandle();

		Set<String> allWindowhdls = driver.getWindowHandles();
		
		System.out.println("############## Switch window based on title ##############");
		for (String eachWindowHandle : allWindowhdls) {
			driver.switchTo().window(eachWindowHandle);
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("XPath")) {
				System.out.println(driver.getTitle());
				break;
			}
		}

		System.out.println(driver.getTitle());

		System.out.println("Switch window based on windowhandles");
		for (String eachWindowHandle : allWindowhdls) {
			if (eachWindowHandle.equalsIgnoreCase(ParentWindHndl)) {
				driver.switchTo().window(eachWindowHandle);
			}
		}
		driver.close();
//		driver.switchTo().window(ParentWindHndl);
		System.out.println(driver.getTitle());

	}
}
