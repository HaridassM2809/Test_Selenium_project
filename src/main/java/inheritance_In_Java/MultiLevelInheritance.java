package inheritance_In_Java;

public class MultiLevelInheritance extends ClassA {

	public static void main(String[] args) {
		MultiLevelInheritance obj = new MultiLevelInheritance();
		obj.method1();
		obj.method2();
		method3(); // static method within class so calling directly
		obj.method4();
		obj.method6();
		obj.method8();
		obj.method10();
		ClassA.method5();
		ClassA.method7();
		ClassA.method9();
		PartentInterface.method11();

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");

		ClassB obj1 = new MultiLevelInheritance();
		obj1.method6();
		obj1.method8();
		obj1.method10();
	}

	public void method1() {
		System.out.println("Non-static method from method1");
	}

	public int method2() {
		System.out.println("Non-static method with int return type from method2");
		return 0;
	}

	public static void method3() {
		System.out.println("Static method from method3");
	}
}

class ClassA extends ClassB {

	public void method4() {
		System.out.println("Non-static method from method4 in classA");
	}

	public static void method5() {
		System.out.println("Static method from method5 in ClassA");
	}
}

class ClassB extends ClassC {

	public void method6() {
		System.out.println("Non-static method from method6 in classB");
	}

	public static void method7() {
		System.out.println("Static method from method7 in ClassB");
	}
}

class ClassC implements PartentInterface {

	public void method8() {
		System.out.println("Non-static method from method8 in classC");
	}

	public static void method9() {
		System.out.println("Static method from method9 in ClassC");
	}

	@Override
	public void method10() {
		System.out.println("Implemented this method10 in ClassC from PartentInterface");

	}
}

interface PartentInterface {
	public void method10();

	static void method11() {
		System.out.println("default static method11 in PartentInterface");
	}
}
