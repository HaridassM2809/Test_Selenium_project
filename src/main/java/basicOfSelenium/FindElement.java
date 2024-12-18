package basicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement {

	public static void main(String[] args) {
		System.getProperty("Webdriver_edge_drive", ".\\\\Driver\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.linkText("Shorts"));
		element.click();
		

	}

}
