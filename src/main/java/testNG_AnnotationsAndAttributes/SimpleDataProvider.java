package testNG_AnnotationsAndAttributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProvider {
	
	@Test(dataProvider = "NameAndOffice")
	public void testingDataProvider(String name, String office) {
		System.out.println("Person Name: "+name);
		System.out.println("Office Name: "+office);
	}
	
	@DataProvider
	public Object[][] NameAndOffice() {
	
		Object[][] data = new Object[3][2]; 
		//2 - represents no.of parameters
		//3 - represents how many times you want to run the method
		
		data[0][0] = "Hari";
		data[0][1] = "JCE";
		
		data[1][0] = "Harish";
		data[1][1] = "Wipro";
		
		data[2][0] = "Haridass";
		data[2][1] = "";
		
		return data;
				
	}

}
