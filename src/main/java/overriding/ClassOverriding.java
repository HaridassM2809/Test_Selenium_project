package overriding;

//* Also called as runtime polymorphism and it happens between two classes
//* In order to achieve this, we need to use inheritance concept and object creation 
//	where we create obj for child class with parent class as reference class
//* It based on method signature.
//* In order to achieve this, 
//* Method name should be same
//* Type, order and number of parameter should same between parent and child
//* Return type of methods between child and parent methods must be same
//* Overriding is not possible between two static methods. Overriding is based on object creation only.
//	* But to call static methods, we dont need to create Object. 
//	* Since there is no need to create object, overriding is not possible with static methods

//Java example: 
//*  Whatever methods in List interface is overrided in its Child classes "ArrayList", "LinkedList"
//* Whatever methods in Set interface is overrided in its Child classes "HashSet", "LinkedHashSet"
//Selenium example:
//* List<WebElement> findElements(By by);
//* WebElement findElement(By by);
//* Above two methods are created in SearchContext interface but its is overrided in class interface "WebDriver"
//* Again its overrided in child Class "Remote WebDriver"
//* Whatever methods we have in WebDriver interface is overrided in "RemoteWebDriver" class
//Selenium Hierarchy
//class ChromeDriver extends ChromiumDriver;
//class ChromiumDriver extends RemoteWebDriver;
//class RemoteWebDriver implements WebDriver;
//interface WebDriver extends SearchContext;

public class ClassOverriding extends ParentClassOverriding {

	public static void main(String[] args) {
		
//		Normal object creation for Child class and a reference as Child class
//		Created object for child class, available all non-static method present both parent & child class through this object creation
		ClassOverriding obj = new ClassOverriding(); 
		obj.buyBike();
		obj.buyDress();
		obj.buyPen();
		obj.buySoap();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
		
		
//		Normal object creation for parent class and a reference as Parent class
//		Created object for parent class, available all non-static method present parent class through this object creation
		ParentClassOverriding obj1 = new ParentClassOverriding();
		obj1.buyBike();
		obj1.buyDress();
		obj1.buySoap();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
		
		
//	    object creation for Child class and a reference as parent class
//		Created object for child class, available all non-static method present parent class only through this object creation
		System.out.println("Overriding concept");
		ParentClassOverriding obj2 = new ClassOverriding();
//		this object creation will check while running, if that method available in the child class then it will take in child class itself but if not available then only it will go and check parent class
		obj2.buyBike();
		obj2.buyDress();
		obj2.buySoap();
		

	}
	public void buyBike() {
		System.out.println("Buy bike method in ClassOverriding");
	}
	public void buySoap() {
		System.out.println("Buy soap method in ClassOverriding");
	}
	public void buyPen() {
		System.out.println("Buy pen method in ClassOverriding");
	}

}

class ParentClassOverriding{
	
	public void buyBike() {
		System.out.println("Buy bike method in ParentClassOverriding");
	}
	public void buySoap() {
		System.out.println("Buy soap method in ParentClassOverriding");
	}
	public void buyDress() {
		System.out.println("Buy dress method in ParentClassOverriding");
	}
	
}
