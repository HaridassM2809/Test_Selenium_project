package abstractBasic;

public class ClassE extends ClassD{
	
//	Normal ClassE follows Abstract ClassD and Abstract class follows interface 
//	so we need to implements body less method in this class

	@Override
	public void methodB1() {
		System.out.println("MethodB1 implemented in ClasE from interfaceB");
		
	}

	@Override
	public void methodB4() {
		System.out.println("MethodB4 implemented in ClasE from interfaceB");
		
	}

	@Override
	void methodD1() {
		System.out.println("MethodD1 implemented in ClasE from abstract classD");
		
	}

	@Override
	public void methodC1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int methodC2() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		
		ClassE obj = new ClassE();
		obj.methodB5(); // MethodB5 is non static method from interfaceB, so called with object name.
		ExInterfaceB.methodB6(); //MethodB6 is static method from interfaceB, so called with interface name.
		ExInterfaceB.methodB7(0);
		
		ExInterfaceC.methodC3();
		
//		Non-static method from classE, so called with object name
		obj.methodB1();
		obj.methodB4();
		obj.methodD1();
		
	}

}
