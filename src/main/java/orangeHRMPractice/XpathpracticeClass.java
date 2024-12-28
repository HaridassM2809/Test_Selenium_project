package orangeHRMPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathpracticeClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver" , ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button [text()=' Login ' ]")).click();
		
//		&&&&&&&&&&&&&&&&&&&&&&
		
		driver.findElement(By.xpath("//span[text() = 'PIM']")).click();
		
//		&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		driver.findElement(By.xpath("//span [contains(text(),'Configuration')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() = 'Optional Fields']")).click(); // configuration drop down
		
//		Optional fields page 
		driver.findElement(By.xpath("//h6 [text() = 'Show Deprecated Fields']//following-sibling :: div//div//div//label//span")).click();
		driver.findElement(By.xpath("//p [text() = 'Show SSN field in Personal Details'] //following-sibling :: div//label//span")).click();
		driver.findElement(By.xpath("//p [text() = 'Show SIN field in Personal Details'] //following-sibling :: div//label//span")).click();
		driver.findElement(By.xpath("//p [text() = 'Show US Tax Exemptions menu'] //following-sibling :: div//label//span")).click();
		//p [text() = 'Show SSN field in Personal Details'] //following-sibling :: div//label//span
		
//		&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& 
//		PIM empl name input 
		//label [text() = 'Employee Name']/parent :: div/following-sibling::div/div/div/input [@placeholder = 'Type for hints...']
//		driver.findElement(By.xpath("//label [text() = 'Employee Name']/parent :: div/following-sibling::div/div/div/input [@placeholder = 'Type for hints...']")).sendKeys("Adam756640");
		
//		PIM empl id input 
//		driver.findElement(By.xpath("//label [text() = 'Employee Id']/parent :: div/following-sibling::div/input [@ class='oxd-input oxd-input--active']")).sendKeys("12345");
		
//		Empl status dropdown
//		driver.findElement(By.xpath("//label [text() = 'Employment Status']/parent :: div/following-sibling::div/div/div/div [@tabindex = '0']")).click();
		
//		include dropdown
			//label [text() = 'Include']/parent :: div/following-sibling::div/div/div/div [@tabindex = '0']
		
//		Supervisor Name
		//label [text() = 'Supervisor Name']/parent :: div/following-sibling::div/div/div/input [@placeholder = 'Type for hints...']
		
//		Job Title dropdown
		//label [text() = 'Job Title']/parent :: div/following-sibling::div/div/div/div [@tabindex = '0']
		
//		Sub unit dropdown
		//label [text() = 'Sub Unit']/parent :: div/following-sibling::div/div/div/div [@tabindex = '0']
		
//		Reset and Search button
//		driver.findElement(By.xpath("//button [@type = 'reset']")).click();
//		driver.findElement(By.xpath("//button [@type = 'submit']")).click();
		
//		To click the checkbox
//		driver.findElement(By.xpath("//div[@role='columnheader']//div//label//span//i")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		
//		searched empl and clicked on edit 
//		driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']//button//i[@class='oxd-icon bi-pencil-fill']")).click();
		
//		searched empl and clicked on delete 		
//		driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']//button//i[@class='oxd-icon bi-trash']")).click();
//		*******************************************
//		Employee list page 
		//a [text () = 'Employee List']
		
//		&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//		Add Employee page
		//a[text() ='Add Employee']
		
		//input[@name='firstName']
		//input[@name='middleName']
		//input[@name='lastName']
		
		//button [@type = 'submit']
		
//		&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		//		Reports page 
		//a [contains (text() ,'Report')]
	}
	
	

}
