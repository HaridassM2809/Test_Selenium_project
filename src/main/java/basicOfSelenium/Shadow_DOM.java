package basicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_DOM {
	
//	WebPage to refer for CSS: https://www.geeksforgeeks.org/selenium-css-selectors/
	
//	Shadow root elements
//
//	* If an element is present inside the shadow root, we can not locate it in DOM using xPath or CSS.
//		It always shows 0 of 0.
//	* To access an element which is present inside the shadow DOM or show root. You need to find the host of the shadow root
//		* Then use the method getShadowRoot();
//	* Keep in mind that, xPath won't work inside the shadow root. 
//		* You need to use the CSS Selector

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/shadowdom");
		driver.manage().window().maximize();
		SearchContext shadowDom = driver.findElement(By.id("shadow-host")).getShadowRoot();
//		shadowDom.findElement(By.xpath("//button [contains (text(), 'inside a Shadow')]")); //inside shadowroot  xpath/id/class won't work
		shadowDom.findElement(By.cssSelector("button[type ='button']"));	
		
	}

}
