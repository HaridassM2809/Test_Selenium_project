package orangeHRMPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GenericMethod {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchWebsite("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		loginDetails("Admin", "admin123");
		pIMtab();
//		pimPageEmployeeName("Rahul  Das");
//		pimPageEmployeeId("0403");
//		pimPageEmploymentStatus("Full-Time Permanent");
//		pimPageSearchButton("Search");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
//		pimPageDataDeleteWithNameFromTable("0447", "No");
//		pimPageNaviConfigurationMenu("Optional");
		pimPageNavigMenu("Add Employee");
		pimAddEmployeePage("Harish","M");
		
	}
	public static void launchBrowser(String browser) {
		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}
	}

	public static void launchWebsite(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void loginDetails(String Username, String Password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button [text()=' Login ' ]")).click();
	}

	public static void pIMtab() {
		driver.findElement(By.xpath("//span[text() = 'PIM']")).click();
	}
	
	public static void pimPageEmployeeName(String empname) {
		driver.findElement(By.xpath("//label[text()='Employee Name']//parent::div//following-sibling::div//input[@placeholder='Type for hints...']")).sendKeys(empname);
	}
	
	public static void pimPageEmployeeId(String empId) {
		driver.findElement(By.xpath("//label[text()='Employee Id']//parent::div//following-sibling::div//input")).sendKeys(empId);
	}
	
	public static void pimPageEmploymentStatus(String empStatus) {
		driver.findElement(By.xpath("//label[text() = 'Employment Status']//following::div")).click();
		driver.findElement(By.xpath("//div[@role='listbox']//span [ text() = '"+empStatus+"']")).click();
	}
	public static void pimPageInclude(String includeType) {
		driver.findElement(By.xpath("//label[text() = 'Include']//following::div")).click();
		driver.findElement(By.xpath("//div[@role='listbox']//span[text()='"+includeType+"']")).click();
	}
	
	public static void pimPageSupervisorName(String supname) {
		driver.findElement(By.xpath("//label[text()='Supervisor Name']//parent::div//following-sibling::div//input[@placeholder='Type for hints...']")).sendKeys(supname);
	}
	
	public static void pimPageJobTitle(String jobtitle) {
		driver.findElement(By.xpath("//label[text()='Job Title']//following::div")).click();
		driver.findElement(By.xpath("//div[@role='listbox']//span[text()='"+jobtitle+"']")).click();
	}
	public static void pimPageSubUnit(String subunit) {
		driver.findElement(By.xpath("//label[text()='Sub Unit']//following::div")).click();
		driver.findElement(By.xpath("//div[@role='listbox']//span[text()='"+subunit+"']")).click();
	}
	
	public static void pimPageSearchButton(String button) {
		switch(button){
		case "Search":
			driver.findElement(By.xpath("//button [@type = 'submit']")).click();
			break;
		case "Reset":
			driver.findElement(By.xpath("//button [@type = 'reset']")).click();
			break;
		}
	}
	
	public static void pimPageDataEditWithNameFromTable(String firstName) {
		driver.findElement(By.xpath("//div[contains(text(),'"+firstName+"')]//parent::div//following-sibling::div//i[@class='oxd-icon bi-pencil-fill']")).click();
	}
	
	public static void pimPageDataDeleteWithNameFromTable(String firstName,String confirm) throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'"+firstName+"')]//parent::div//following-sibling::div//i[@class='oxd-icon bi-trash']")).click();
		Thread.sleep(2000);
		switch (confirm) {
		case "Yes":
			driver.findElement(By.xpath("//button[contains (@class, \"label-danger orangehrm-button-margin\")]")).click();
			break;
			
		case "No":
			driver.findElement(By.xpath("//button[contains (@class, \"ghost orangehrm-button-margin\")]")).click();
			break;		
		}
	}
	
	public static void pimPageNaviConfigurationMenu(String configDpdvalue) throws InterruptedException {
		driver.findElement(By.xpath("//span [contains(text(),'Configuration')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text() , '"+configDpdvalue+" ')]")).click();
	}
	
	public static void pimPageNavigMenu(String NavigMenuName) {
		driver.findElement(By.xpath("//a [contains(text (),'"+NavigMenuName+"')]")).click();
	}
	
	public static void pimAddEmployeePage(String fstName,String lstName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fstName);
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lstName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button [@type = 'submit']")).click();
	}
	

}
