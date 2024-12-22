package javaBasic;

public class CallingMethodOutsideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//Outside a class
//* Calling a static method of another class from non-static method 
//		- ClassName + static method name
//* Calling a static method of another class from static method 
//		- ClassName + static method name
//* Calling a non-static method of another class from non-static method 
//		- Object Creation
//* Calling a non-static method of another class from static method 
//		- Object Creation

//OutsideOfClass		static			   non-static
//static 				CLASSNAME          OBJECT CREATION
//non-static          CLASSNAME          OBJECT CREATION

//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

//CONCLUSTION
//When you are going to call a 
//	* Non-static - Object Creation
//	* static - direct(within a class) or along with class name (outside of class)

	public void methodA() {
		System.out.println("this a new");
		AnotherClass obj = new AnotherClass(); // From Non-static method calling a non-static method from AnotherClass
		obj.methodA1();

		AnotherClass.methodB1(); // From Non-static method calling a static method from AnotherClass
	}

	public void methodB() {

	}

	static public void methodC() {
		AnotherClass.methodB1(); // From static method calling a static method from AnotherClass

		AnotherClass obj2 = new AnotherClass(); // From static method calling a non-static method from AnotherClass
		obj2.methodA1();
	}

	public static void methodD() {

	}
}

class AnotherClass {
	public void methodA1() {

	}

	static public void methodB1() {

	}

}
