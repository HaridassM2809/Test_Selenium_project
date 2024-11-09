package abstractBasic;

interface ExInterfaceB {
	
	public void methodB1();
	
//	private void methodB2();

//	protected void methodB3();
	
//	default void methodB4();
	
	void methodB4();
	
	default void methodB5() {
		System.out.println("default method from Interface B");
	}
	public static int methodB6() {
		System.out.println("public static method and int datatype from Interface B");
		return 0;
	}
	static void methodB7(int a) {
		System.out.println("default static method from interface B");
	}
}

interface ExInterfaceC extends ExInterfaceB{
	
	public void methodC1();
	
	int methodC2();
	
	static char methodC3() {
		System.out.println("static method from interface C");
		return 0;
	}
}

abstract class ClassD implements ExInterfaceC{
	
//	Abstract class can have body less method,so when abstract class follows interface,
//	we don't need to implements interface's body less method in abstract class
//	We can't create object for Abstract class
	
//	ClassD obj = new ClassD();
	
	
	abstract void methodD1();
	
}
