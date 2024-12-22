package javaBasic;

public class CallingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	With in A class
//	* Calling a static method from non-static method 
//			- Direct
//	* Calling a static method from static method 
//			- Direct
//	* Calling a non-static method from non-static method 
//			- Direct/ Object Creation
//	* Calling a non-static method from static method 
//			- Object Creation

//withInAClass(from)		static			non-static
//static 				    DIRECT          OBJECT CREATION
//non-static              DIRECT          DIRECT/OBJECT CREATION

//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//	CONCLUSTION
// 	When you are going to call a 
//		* Non-static - Object Creation
//		* static - direct(within a class) or along with class name (outside of class)

	public void methodA() {
		System.out.println("this a new");
		methodB(); // from Non-static method calling another non-static method

		// or
		CallingMethod obj = new CallingMethod();
		obj.methodB();

//    	&&&&&&
		methodD(); // from Non-static method calling another static method

	}

	public void methodB() {

	}

	static public void methodC() {
//    	ClassName objectName = new ClassName ();  - object creation syntax
		CallingMethod obj = new CallingMethod(); // from static method calling another non-static method
		obj.methodB();

//    	&&&&&&
		methodD(); // from static method calling another static method

	}

	public static void methodD() {

	}
}
