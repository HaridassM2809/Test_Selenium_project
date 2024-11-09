package abstractBasic;

public abstract class ClassAbstract {
	
//	In Abstract class we have either body less or body method and both body or body less method.
//	but we need Abstract keyword in class and body less method.
	
	public abstract void methodA1();
	
//	private abstract void methodA2();  //we can't create private abstract body less method
	
	protected abstract void methodA3();
	
	abstract void methodA4();
	
	void methodA5() {
		System.out.println("default method from ClassAbstract A");
	}
	static int methodA6() {
		System.out.println("static method and int datatype from ClassAbstract A");
		return 0;
	}
	public void methodA7(int a) {
		System.out.println("public method with int parameter from ClassAbstract A");
	}
		
}
