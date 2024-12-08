package basicOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basic {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\git\\Test_Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
//		driver.quit();
		System.out.println(System.getProperty("user.dir"));
		System.getProperty("Webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().fullscreen();
		driver1.get("https://youtube.com/");
		System.out.println(driver1.getTitle());
		
	}
     
}
