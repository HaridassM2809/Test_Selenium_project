package overloading;

//* It happens within a Class
//* Its based on method signature (methodName with or without parameter)
//	* Method name should be same
//	* Parameters SHOULD/MUST vary
//		* Type of parameter
//		* Order of parameter
//		* No. of parameter
//* Compile time polymorphism
//* return type is secondary in overloading. 
//		* Means, if two methods have same method signature and have different return types 
//			then we will see error as duplicate method.
//* We can overload static method

//Java Example: String class
//	* public boolean startsWith(String prefix, int toffset) { }
//	* public boolean startsWith(String prefix) { }
//	* public int indexOf(int ch) { }
//	* public int indexOf(int ch, int fromIndex) { }

//Selenium Example:
//	* WebDriver frame(int index);
//	* WebDriver frame(String nameOrId);
//	* WebDriver frame(WebElement frameElement);
//	* driver.findElement(By.id("string"))
//	* driver.findElement(By.name("string"))
//	* driver.findElements(By.id("string"))
//	* driver.findElements(By.name("string"))

public class ClassOverloading {

	public void method1() {
		System.out.println("Non-static method1 in ClassOverloading");
	}

//	public int method1() { // return type diff will not work
//
//	}

	public void method1(int a) {
		System.out.println("Non-static method1 with int parameter in ClassOverloading");
	}

	public int method2() {
		System.out.println("Non-static method2 in ClassOverloading");
		return 0;
	}

	public void method2(String str) {
		System.out.println("Non-static method2 with string parameter in ClassOverloading");
	}

	public static void main(String[] args) {
		ClassOverloading obj = new ClassOverloading();
		obj.method1();
		obj.method1(0);
		obj.method2();
		obj.method2("Hari");

	}

}
