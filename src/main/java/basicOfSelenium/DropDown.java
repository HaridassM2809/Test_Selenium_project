package basicOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.edge", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement country_dropdown = driver.findElement(By.xpath("//div[@rel-title='Select Country']/p/select"));
		Select dpd = new Select(country_dropdown);
		System.out.println(dpd.isMultiple());
		
		dpd.selectByIndex(1);
		Thread.sleep(2000);
		dpd.selectByValue("IND"); //this will take from DOM option value
		Thread.sleep(2000);
		dpd.selectByContainsVisibleText("Barbuda");
		dpd.selectByVisibleText("Australia"); //this will take from visible text
		
		System.out.println(driver.findElement(By.linkText("CHEATSHEETS")));
	}

}
