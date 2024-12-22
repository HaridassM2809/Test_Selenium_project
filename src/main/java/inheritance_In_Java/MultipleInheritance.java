package inheritance_In_Java;

public class MultipleInheritance extends ClassMIA implements InterfaceA, InterfaceB {

	public void methodMI() {
		System.out.println("Non-static methodMI from MultipleInheritance");
	}

	public static void main(String[] args) {

		MultipleInheritance obj = new MultipleInheritance();
		obj.method1();
		obj.method3();
		obj.method4();
		obj.method6();
		obj.method7();
		obj.methodMI();

		ClassMIA.method2();
		InterfaceA.method5();
		InterfaceB.method8();

	}

	@Override
	public void method6() {
		System.out.println("implemented method6 from InterfaceB unimplemented method");

	}

	@Override
	public void method3() {
		System.out.println("implemented method3 from InterfaceA unimplemented method");

	}

}

class ClassMIA {

	public void method1() {
		System.out.println("Non-static method1 from ClassMIA");
	}

	static public void method2() {
		System.out.println("Static method2 from ClassMIA");
	}
}

interface InterfaceA {

	public void method3();

	default void method4() {
		System.out.println("Non-static default method4 from InterfaceA");
	}

	static public void method5() {
		System.out.println("Static method5 from InterfaceA");
	}
}

interface InterfaceB {

	public void method6();

	default void method7() {
		System.out.println("Non-static default method7 from InterfaceB");
	}

	static public void method8() {
		System.out.println("Static method8 from InterfaceB");
	}
}
