package javaBasic;

public class TypesOfVariable {

//local variable
	public static void main(String[] args) {
		int a = 10; // local variable
		System.out.println(a);
	}

//Class variable //mostly class var is non-static variable
	int a1 = 10; // class variable
	String b = "Hello"; // class variable

	private static void method1(String[] args) {
//    	System.out.println(a1); //you can't call class non-static var in a static method without object creation
	}

//how to call class variable inside a non-static method
	boolean a2 = true;
	char b2 = 'H';

	protected void main3(String[] args) {
		System.out.println(a2);
		System.out.println(b2);
	}

//how to call class variable inside a static method
	boolean a3 = false;
	char bb = 'H';

	static void main4(String[] args) { // default method
		// ClassName objectName = new ClassVariable ();
		TypesOfVariable hari = new TypesOfVariable(); // object creation
		System.out.println(hari.a3);
		System.out.println(hari.bb);
	}

}