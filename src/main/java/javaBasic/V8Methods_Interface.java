package javaBasic;

public interface V8Methods_Interface {

//	In interface, you can have
//	* only body less methods
//	* only body methods  (static or default)
//	* both body less and body method
	
	public void method1(); //body less public method
	
	void method2(int a); //In Default method without default access modifier mention we can't create body method
	
	default int method3(String str) { //default string parameterized method with int return type
		return 0;
	}
	
//	*************************************
//  Static method with body and with different access modifier
	public static void methodA4() {
	
	}
   
	private static void methodA5() {
	
	}

//	static protected void methodA6() {
//	
//	}

	static void methodA7() {
	
	}
	
//  Static method without body and with different access modifier

//	public static void methodA14();

//	private static void methodA15();

//	protected static void method16();

//	static void method17();  //without body we can't use static method

//**********************************************

//  non static method with body and body less method


//	public void method4() {
//		
//	}
	private void method5() {
		
	}
//	protected void method6() {
//		
//	}
//	void method7() {
//		
//	}
//******************************
	public void method14();
	
//	private void method15();
	
//	protected void method16();
	
	void method17();
	
}
