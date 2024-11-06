package javaBasic;

public class V5ConstructorWithFinalVariable {
	
	final int c;
	final String d; //if final variable is not initialized on class level then those final var need to initialized in all constructor
	char e;

	public V5ConstructorWithFinalVariable() {
		this.c = 1;
		this.d = "Hari";
		System.out.println("This is a default constructor");
	}

	public V5ConstructorWithFinalVariable(char a) {
		this.c = 05;
		this.d = "Hello";
		System.out.println("This is a constructor with char parameter");
	}

	public V5ConstructorWithFinalVariable(String b) {
		this.c = 22;
		this.d = "Null";
		System.out.println("This is a constructor with String parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V5ConstructorWithFinalVariable obj = new V5ConstructorWithFinalVariable();
		System.out.println(obj.c);
		
		
		V5ConstructorWithFinalVariable obj1 = new V5ConstructorWithFinalVariable('h');
		System.out.println(obj1.d);
		
		V5ConstructorWithFinalVariable obj2 = new V5ConstructorWithFinalVariable("Hi");
		method2();
		obj2.method1();
		System.out.println(obj2.d);
	}
	public void method1() {
		System.out.println("this is a non-static method");
	}
	public static void method2() {
		System.out.println("this is a static method");
	}
}
