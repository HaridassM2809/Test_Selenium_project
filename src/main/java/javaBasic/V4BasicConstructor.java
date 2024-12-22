package javaBasic;

public class V4BasicConstructor {

//	Constructor Syntax:	
//	AccessModifier ClassName() {
//		
//	}

//	public V4BasicConstructor() { 
//		System.out.println("I am a default Constructor");
//	}
//  * When the default constructor was implicitly present and you create a Constructor with parameter
//	* Then the default constructor will vanish. 
//	* Which means, we can not create a object for the class using default constructor.

	public V4BasicConstructor(String str) {
		System.out.println("I am a String parameter Constructor");
	}

	public static void main(String[] args) {
//		V4BasicConstructor obj = new V4BasicConstructor();
		V4BasicConstructor obj1 = new V4BasicConstructor("Hari");
		obj1.methodA();
		methodB();
	}

	public void methodA() {
		System.out.println("I am a non-static method");
	}

	public static void methodB() {
		System.out.println("I am a static method");
	}

}
