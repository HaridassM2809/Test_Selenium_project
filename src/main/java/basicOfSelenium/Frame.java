package basicOfSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame {

	static WebDriver driver;

	public static void main(String[] args) {
//		switchWindow();

		System.getProperty("Webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.switchTo().frame("globalSqa"); //switched to frame site using attribute name using - frame name method
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='globalSqa']"))); // switched to frame site
																								// using frame
																								// webelement method
		String text = driver.findElement(By.xpath("//h1[text() = 'Trainings']")).getText();
		System.out.println(text);
	}

	public static void switchWindow() {
		System.getProperty("Webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String ParentWindowTitle = driver.getTitle();
		System.out.println(ParentWindowTitle);
		driver.findElement(By.xpath("//a [contains (text() ,'Click Here')]")).click();
		String parentWinHndl = driver.getWindowHandle();
		Set<String> allwindowHandles = driver.getWindowHandles();

		for (String eachWindHndls : allwindowHandles) {
			driver.switchTo().window(eachWindHndls);
			System.out.println(driver.getWindowHandle());
			if (!eachWindHndls.equalsIgnoreCase(parentWinHndl)) {
				System.out.println(
						"Window Handle =" + driver.getWindowHandle() + " and their title " + driver.getTitle());
			}
		}

	}

}
