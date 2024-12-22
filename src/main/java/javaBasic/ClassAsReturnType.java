package javaBasic;

public class ClassAsReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExClass abc = new ExClass();
		System.out.println(abc.b);

		ClassAsReturnType obj1 = new ClassAsReturnType();
		System.out.println(obj1.menthodAA().a);

	}

	public ExClass menthodAA() {

		ExClass obj = new ExClass();
		return obj;
//		System.out.println();
	}

}

class ExClass {

	int a = 10;
	char b = 'H';

	public void method1() {
		System.out.println("I'm a Non-static method1");
	}

	static public void method2() {
		System.out.println("I'm a static method1");
	}
}
