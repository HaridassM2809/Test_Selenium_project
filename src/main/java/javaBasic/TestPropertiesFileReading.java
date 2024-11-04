package javaBasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesFileReading {

	public static void main(String[] args) throws IOException {
		String filepath ="C:\\Users\\Admin\\git\\Test_Selenium_project\\src\\test\\resources\\test.properties"; // properties file path
		Properties props = new Properties(); // creating object for properties file
		FileInputStream fis = new FileInputStream(filepath); //since we are using file we need to create a object for fileinputstream 
		props.load(fis);
		
		String url = props.getProperty("URL");
		String brows = props.getProperty("Browser");
		System.out.println("****"+url+" Open in "+brows+".");
		

	}

}
