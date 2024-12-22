package basicOfSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassExample {
	static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/upload/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		StringSelection stringSelection = new StringSelection("C:\\Users\\Admin\\Desktop\\Abc.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		WebElement locator = driver.findElement(By.id("uploadfile_0"));
		locator.click();
//		driver.findElement(By.xpath("//div[@id='file_wraper0']//input[@type='file']")).click();
		Thread.sleep(3000);

		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void fbLoginWithRobotClass() throws AWTException {

		System.getProperty("Webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).click();

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_H);
		robo.keyRelease(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_R);
		robo.keyRelease(KeyEvent.VK_R);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);

		driver.findElement(By.id("pass")).click();
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_2);
		robo.keyRelease(KeyEvent.VK_2);
		robo.keyPress(KeyEvent.VK_3);
		robo.keyRelease(KeyEvent.VK_3);
		robo.keyPress(KeyEvent.VK_4);
		robo.keyRelease(KeyEvent.VK_4);
		robo.keyPress(KeyEvent.VK_8);
		robo.keyRelease(KeyEvent.VK_8);
		robo.keyRelease(KeyEvent.VK_SHIFT);
	}

}
